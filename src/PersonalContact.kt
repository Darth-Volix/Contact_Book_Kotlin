class PersonalContact(var name: String, var phoneNumber: String, var relationship: String) {
    fun update(name: String, phoneNumber: String, relationship: String) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.relationship = relationship
    }

    fun display() {
        println("Personal Contact - Name: $name, Phone: $phoneNumber, Relationship: $relationship")
    }
}