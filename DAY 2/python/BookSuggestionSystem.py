import random

books = ["The Hobbit", "The Mystery", "Animal Farm", "Brave Kingdom", "1984"]


def suggest_book():
    book = random.choice(books)
    page = random.randint(1, 100)
    print("Book Title:", book)
    print("Page:", page)

    answer = input("Would you like another suggestion? (yes/no): ")
    while answer == "yes":
        book = random.choice(books)
        page = random.randint(1, 100)
        print("Book Title:", book)
        print("Page:", page)
        answer = input("Would you like another suggestion? (yes/no): ")


def add_book(title):
    if title in books:
        print("Book already exists!")
    else:
        books.append(title)
        print("Book added successfully!")


def remove_book(title):
    if title in books:
        books.remove(title)
        print("Book removed successfully!")
    else:
        print("Book not found!")


def update_book(old_title, new_title):
    if old_title in books:
        index = books.index(old_title)
        books[index] = new_title
        print("Book updated successfully!")
    else:
        print("Book not found!")


def show_all_books():
    print("All Books:")
    for i in range(len(books)):
        print(i + 1, ".", books[i])


# This block only runs when you execute this file directly.
# It does NOT run when the test file imports it.
if __name__ == "__main__":
    print("Welcome to the Book Suggestion System!")

    while True:
        print("\n1. Get Suggestions")
        print("2. Add Book")
        print("3. Remove Book")
        print("4. Update Book")
        print("5. Show All Books")
        print("6. Exit")

        choice = input("Enter operation: ")

        if choice == "1":
            suggest_book()
        elif choice == "2":
            title = input("Enter book title: ")
            add_book(title)
        elif choice == "3":
            title = input("Enter book title to remove: ")
            remove_book(title)
        elif choice == "4":
            old = input("Enter old title: ")
            new = input("Enter new title: ")
            update_book(old, new)
        elif choice == "5":
            show_all_books()
        elif choice == "6":
            print("Goodbye!")
            break
        else:
            print("Invalid option, try again.")
