class MainMenu {
    private val contactBook = ContactBook()

    fun menu() {
        while (true) {
            println("\nContact Book Menu:")
            println("1. Add Personal Contact")
            println("2. Add Business Contact")
            println("3. Edit Personal Contact")
            println("4. Edit Business Contact")
            println("5. Delete Personal Contact")
            println("6. Delete Business Contact")
            println("7. Search Personal Contacts")
            println("8. Search Business Contacts")
            println("9. Display All Contacts")
            println("10. Exit")
            print("Choose an option: ")

            when (readLine()?.toIntOrNull()) {
                1 -> addPersonalContact()
                2 -> addBusinessContact()
                3 -> editPersonalContact()
                4 -> editBusinessContact()
                5 -> deletePersonalContact()
                6 -> deleteBusinessContact()
                7 -> searchPersonalContacts()
                8 -> searchBusinessContacts()
                9 -> contactBook.displayAllContacts()
                10 -> {
                    println("Exiting program. Goodbye!")
                    return
                }
                else -> println("Invalid option. Please try again.")
            }
        }
    }

    private fun addPersonalContact() {
        print("Enter name: ")
        val name = readLine() ?: ""
        print("Enter phone number: ")
        val phone = readLine() ?: ""
        print("Enter relationship: ")
        val relationship = readLine() ?: ""
        contactBook.addPersonalContact(PersonalContact(name, phone, relationship))
    }

    private fun addBusinessContact() {
        print("Enter name: ")
        val name = readLine() ?: ""
        print("Enter phone number: ")
        val phone = readLine() ?: ""
        print("Enter company name: ")
        val company = readLine() ?: ""
        contactBook.addBusinessContact(BusinessContact(name, phone, company))
    }

    private fun editPersonalContact() {
        print("Enter the name of the personal contact to edit: ")
        val name = readLine() ?: ""
        contactBook.editPersonalContact(name)
    }

    private fun editBusinessContact() {
        print("Enter the name of the business contact to edit: ")
        val name = readLine() ?: ""
        contactBook.editBusinessContact(name)
    }

    private fun deletePersonalContact() {
        print("Enter the name of the personal contact to delete: ")
        val name = readLine() ?: ""
        contactBook.deletePersonalContact(name)
    }

    private fun deleteBusinessContact() {
        print("Enter the name of the business contact to delete: ")
        val name = readLine() ?: ""
        contactBook.deleteBusinessContact(name)
    }

    private fun searchPersonalContacts() {
        print("Enter the name to search for in personal contacts: ")
        val name = readLine() ?: ""
        contactBook.searchPersonalContacts(name)
    }

    private fun searchBusinessContacts() {
        print("Enter the name to search for in business contacts: ")
        val name = readLine() ?: ""
        contactBook.searchBusinessContacts(name)
    }
}