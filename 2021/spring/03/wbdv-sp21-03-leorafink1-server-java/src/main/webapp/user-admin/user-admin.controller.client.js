var $usernameFld
var $passwordFld
var $firstNameFld
var $lastNameFld
var $roleFld
var $createUserBtn
var theTableBody

/*$createUserBtn.click(() => {
    var newUser = {
        username: $usernameFld.val(),
        password: $passwordFld.val(),
        firstname: $firstNameFld.val(),
        lastname: $lastNameFld.val(),
        role: $roleFld.val()
    }
    createUser(newUser)
        $usernameFld.val("")
        $passwordFld.val("")
        $firstNameFld.val("")
        $lastNameFld.val("")

})*/



/*function addUser() {
    createUser({
        username: "NEWUSER",
        password: "",
        firstname: "Joe",
        lastname: "Berry",
        role: "Student"
    })
}

addUserBtn.click(addUser())*/

var users = [
    // {username: "ada", password: "", firstname: "Ada", lastname: "Lovelace", role: "Faculty"},
    // {username: "emily", password: "", firstname: "Emily", lastname: "Apple", role: "Faculty"},
    // {username: "brian", password: "", firstname: "Brian", lastname: "Orange", role: "Student"},
    // {username: "nate", password: "", firstname: "Nate", lastname: "Banana", role: "Student"},
    // {username: "kelly", password: "", firstname: "Kelly", lastname: "Strawberry", role: "Faculty"},
    // {username: "dan", password: "", firstname: "Dan", lastname: "Fruit", role: "Student"}
];

function deleteUser(event){
    console.log(event.target)
    var deleteBtn = jQuery(event.target)
    var theClass = deleteBtn.attr("class")
    var theID = deleteBtn.attr("id")
    console.log(theClass)
    console.log(theID)
    users.splice(theID, 1)
    renderUsers(users)
}


function createUser(user) {
    users.push(user)
    renderUsers(users)
}

//createUser({username: "joe", password: "", firstname: "Joe", lastname: "Berry", role: "Student"})

function renderUsers(users) {
    theTableBody.empty()
    for (var i = 0; i < users.length; i++) {
        var user = users[i]
        theTableBody
            .prepend(
            `<tr>
                    <td class="wbdv-username">${user.username}</td>
                    <td>&nbsp;</td>
                    <td class="wbdv-first-name">${user.firstname}</td>
                    <td class="wbdv-last-name">${user.lastname}</td>
                    <td class="wbdv-role">${user.role}</td>
                    <td class="wbdv-actions">
                <span class="pull-right">
                     <i class="fa-2x fa fa-times wbdv-remove" id="${i}"></i>
                     <i class="fa-2x fa fa-pencil wbdv-edit"></i>
                </span>
                    </td>
                </tr>`
        )
    }
    jQuery(".wbdv-remove").click(deleteUser)
}

//renderUsers(users)

function main() {
    $usernameFld = $("#wbdv-usernameFld")
    $passwordFld = $("#wbdv-passwordFld")
    $firstNameFld = $("#wbdv-firstNameFld")
    $lastNameFld = $("#wbdv-lastNameFld")
    $roleFld = $("#wbdv-roleFld")
    $createUserBtn = jQuery("#wbdv-create")

    $createUserBtn.click(() => {
        var newUser = {
            username: $usernameFld.val(),
            password: $passwordFld.val(),
            firstname: $firstNameFld.val(),
            lastname: $lastNameFld.val(),
            role: $roleFld.val()
        }
        createUser(newUser)
        $usernameFld.val("")
        $passwordFld.val("")
        $firstNameFld.val("")
        $lastNameFld.val("")

    })

    theTableBody = jQuery("tbody")
}

jQuery(main)