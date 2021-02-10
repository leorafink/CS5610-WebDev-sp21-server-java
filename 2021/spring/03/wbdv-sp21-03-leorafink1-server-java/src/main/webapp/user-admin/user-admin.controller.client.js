var users = [
    {username: "ada", password: "", firstname: "Ada", lastname: "Lovelace", role: "Faculty"},
    {username: "emily", password: "", firstname: "Emily", lastname: "Lovelace", role: "Faculty"},
    {username: "brian", password: "", firstname: "Brian", lastname: "Lovelace", role: "Student"},
    {username: "nate", password: "", firstname: "Nate", lastname: "Lovelace", role: "Student"},
    {username: "kelly", password: "", firstname: "Kelly", lastname: "Lovelace", role: "Faculty"},
    {username: "dan", password: "", firstname: "Dan", lastname: "Lovelace", role: "Student"}
];

var theHeading = jQuery("h1#the-user-admin-heading")
theHeading
.css("background-color", "blue")

var theTableBody = jQuery("tbody")
theTableBody.remove()