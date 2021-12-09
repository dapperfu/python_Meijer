from typing import Dict


class MeijerListItem:
    def __init__(self, meijer_list, **kwargs):
        self.list = meijer_list
        for key, value in kwargs.items():
            setattr(self, key, valu)


class MeijerList:
    """Meijer Shopping List."""

    def __init__(self, meijer=None):
        if meijer is None:
            self.meijer = Meijer()
        else:
            self.meijer = meijer

    def get(self):
        request = dict()
        request["url"] = "https://mservices.meijer.com/listmanagement/api/list"
        request["headers"] = {
            "Accept": "application/meijer.shoppingList.ShoppingList-v1.0+json"
        }
        r = self.meijer.get(**request)
        return r

    def add(self, description):
        request = dict()
        request["url"] = "https://mservices.meijer.com/listmanagement/api/list"
        request["headers"] = {
            "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
            "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
        }
        request["json"] = {
            "listItems": [{"itemDescription": description, "quantity": 1}]
        }
        r = self.meijer.post(**request)
        return r

    def clear(self):
        """Clear completed items."""
        request = dict()
        request["url"] = "https://mservices.meijer.com/listmanagement/api/list"
        request["headers"] = {
            "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
            "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
        }
        return self.meijer.session.delete(**request)

    def complete(self, item):
        """Mark item as complete"""
        if isinstance(item, dict) and "listItemId" in item:
            listItemId = item["listItemId"]
        elif isinstance(item, int):
            listItemId = item
        request = dict()
        request[
            "url"
        ] = f"https://mservices.meijer.com/listmanagement/api/listItem/markascompleted/{listItemId}"
        request["headers"] = {
            "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
            "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
        }
        r = self.meijer.put(**request)
        return r

    def uncomplete(self, item):
        if isinstance(item, dict) and "listItemId" in item:
            listItemId = item["listItemId"]
        elif isinstance(item, int):
            listItemId = item
        request = dict()
        request[
            "url"
        ] = f"https://mservices.meijer.com/listmanagement/api/listItem/markasnotcompleted/{listItemId}"
        request["headers"] = {
            "Accept": "application/vnd.meijer.listManagement.list-v1.0+json",
            "Content-Type": "application/vnd.meijer.listManagement.list-v1.0+json",
        }
        r = self.meijer.put(**request)
        return r

    @property
    def items(self):
        return self.get()["listItems"]

    @property
    def count(self):
        r = self.get()
        assert r["totalCount"] == len(r["listItems"])
        return r["totalCount"]
