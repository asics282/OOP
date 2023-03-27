from Service import *
from VendingMachine import *


def main():
    service = Service()
    service.start()
    vending = VendingMachine()
    vending.button()


if __name__ == '__main__':
    main()
