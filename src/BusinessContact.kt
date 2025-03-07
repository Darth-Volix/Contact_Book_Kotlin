class BusinessContact(var name: String, var phoneNumber: String, var companyName: String) {
    fun update(name: String, phoneNumber: String, companyName: String) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.companyName = companyName
    }

    fun display() {
        println("Business Contact - Name: $name, Phone: $phoneNumber, Company: $companyName")
    }
}