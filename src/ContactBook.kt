class ContactBook {
    private val personalContacts = mutableListOf<PersonalContact>()
    private val businessContacts = mutableListOf<BusinessContact>()

    fun addPersonalContact(contact: PersonalContact) {
        personalContacts.add(contact)
        println("Personal contact added successfully.")
    }

    fun addBusinessContact(contact: BusinessContact) {
        businessContacts.add(contact)
        println("Business contact added successfully.")
    }

    fun editPersonalContact(name: String) {
        val contact = personalContacts.find { it.name == name }
        if (contact != null) {
            print("Enter new name: ")
            val newName = readLine() ?: ""
            print("Enter new phone number: ")
            val newPhone = readLine() ?: ""
            print("Enter new relationship: ")
            val newRelationship = readLine() ?: ""
            contact.update(newName, newPhone, newRelationship)
            println("Personal contact updated.")
        } else {
            println("Personal contact not found.")
        }
    }

    fun editBusinessContact(name: String) {
        val contact = businessContacts.find { it.name == name }
        if (contact != null) {
            print("Enter new name: ")
            val newName = readLine() ?: ""
            print("Enter new phone number: ")
            val newPhone = readLine() ?: ""
            print("Enter new company name: ")
            val newCompany = readLine() ?: ""
            contact.update(newName, newPhone, newCompany)
            println("Business contact updated.")
        } else {
            println("Business contact not found.")
        }
    }

    fun deletePersonalContact(name: String) {
        if (personalContacts.removeIf { it.name == name }) {
            println("Personal contact deleted.")
        } else {
            println("Personal contact not found.")
        }
    }

    fun deleteBusinessContact(name: String) {
        if (businessContacts.removeIf { it.name == name }) {
            println("Business contact deleted.")
        } else {
            println("Business contact not found.")
        }
    }

    fun searchPersonalContacts(name: String) {
        val results = personalContacts.filter { it.name.contains(name, ignoreCase = true) }
        if (results.isNotEmpty()) {
            println("Personal Contacts Found:")
            results.forEach { it.display() }
        } else {
            println("No personal contacts found.")
        }
    }

    fun searchBusinessContacts(name: String) {
        val results = businessContacts.filter { it.name.contains(name, ignoreCase = true) }
        if (results.isNotEmpty()) {
            println("Business Contacts Found:")
            results.forEach { it.display() }
        } else {
            println("No business contacts found.")
        }
    }

    fun displayAllContacts() {
        println("Personal Contacts:")
        if (personalContacts.isEmpty()) {
            println("No personal contacts to display.")
        } else {
            personalContacts.forEach { it.display() }
        }

        println("\nBusiness Contacts:")
        if (businessContacts.isEmpty()) {
            println("No business contacts to display.")
        } else {
            businessContacts.forEach { it.display() }
        }
    }
}