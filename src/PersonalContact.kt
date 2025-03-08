class PersonalContact(var name: String, var phoneNumber: String, var email: String, var relationship: String) {

    // Function to update contact details
    fun update(name: String, phoneNumber: String, email: String, relationship: String) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.email = email
        this.relationship = relationship
    }

    // Function to display contact details
    fun display() {
        println("Personal Contact - Name: $name, Phone: $phoneNumber, Email: $email, Relationship: $relationship")
    }
}