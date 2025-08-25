"""
Shopping list management panel.
"""

from typing import Any

import wx

from services.client import MeijerClientService
from services.settings import SettingsService


class ListPanel(wx.Panel):
    """
    Shopping list management panel.

    Provides functionality to view, add, remove, and manage shopping list items.
    """

    def __init__(
        self,
        parent: wx.Window,
        settings_service: SettingsService,
        client_service: MeijerClientService,
        **kwargs: Any,
    ) -> None:
        """
        Initialize the shopping list panel.

        Args:
            parent: Parent window
            settings_service: Application settings service
            client_service: Meijer client service
            **kwargs: Additional wx.Panel arguments
        """
        super().__init__(parent, **kwargs)

        self.settings_service = settings_service
        self.client_service = client_service
        self.shopping_list: list[dict[str, Any]] = []

        # Create UI
        self._create_ui()

        # Initial refresh
        self.refresh()

    def _create_ui(self) -> None:
        """Create the shopping list UI."""
        # Main sizer
        main_sizer = wx.BoxSizer(wx.VERTICAL)

        # Add item section
        add_box = wx.StaticBox(self, label="Add New Item")
        add_sizer = wx.StaticBoxSizer(add_box, wx.VERTICAL)

        # Item name input
        name_sizer = wx.BoxSizer(wx.HORIZONTAL)
        name_sizer.Add(
            wx.StaticText(self, label="Item Name:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.item_name = wx.TextCtrl(self, size=(300, -1))
        name_sizer.Add(self.item_name, 1, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        add_sizer.Add(name_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # Quantity and notes input
        input_row = wx.BoxSizer(wx.HORIZONTAL)

        # Quantity
        qty_sizer = wx.BoxSizer(wx.HORIZONTAL)
        qty_sizer.Add(
            wx.StaticText(self, label="Quantity:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.item_quantity = wx.SpinCtrl(self, min=1, max=99, initial=1, size=(80, -1))
        qty_sizer.Add(self.item_quantity, 0, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        input_row.Add(qty_sizer, 0, wx.ALL, 5)

        # Notes
        notes_sizer = wx.BoxSizer(wx.HORIZONTAL)
        notes_sizer.Add(
            wx.StaticText(self, label="Notes:"), 0, wx.ALIGN_CENTER_VERTICAL
        )
        self.item_notes = wx.TextCtrl(self, size=(200, -1))
        notes_sizer.Add(self.item_notes, 0, wx.ALIGN_CENTER_VERTICAL | wx.LEFT, 10)
        input_row.Add(notes_sizer, 0, wx.ALL, 5)

        input_row.AddStretchSpacer()
        add_sizer.Add(input_row, 0, wx.EXPAND | wx.ALL, 5)

        # Add button
        self.add_btn = wx.Button(self, label="Add Item")
        self.add_btn.Bind(wx.EVT_BUTTON, self._on_add_item)
        add_sizer.Add(self.add_btn, 0, wx.ALIGN_RIGHT | wx.ALL, 5)

        main_sizer.Add(add_sizer, 0, wx.EXPAND | wx.ALL, 10)

        # Shopping list section
        list_box = wx.StaticBox(self, label="Shopping List")
        list_sizer = wx.StaticBoxSizer(list_box, wx.VERTICAL)

        # List controls
        controls_sizer = wx.BoxSizer(wx.HORIZONTAL)

        self.refresh_btn = wx.Button(self, label="Refresh")
        self.refresh_btn.Bind(wx.EVT_BUTTON, self._on_refresh)
        controls_sizer.Add(self.refresh_btn, 0, wx.ALL, 5)

        self.clear_completed_btn = wx.Button(self, label="Clear Completed")
        self.clear_completed_btn.Bind(wx.EVT_BUTTON, self._on_clear_completed)
        controls_sizer.Add(self.clear_completed_btn, 0, wx.ALL, 5)

        self.estimate_btn = wx.Button(self, label="Estimate Cost")
        self.estimate_btn.Bind(wx.EVT_BUTTON, self._on_estimate_cost)
        controls_sizer.Add(self.estimate_btn, 0, wx.ALL, 5)

        self.defrag_btn = wx.Button(self, label="Defrag List")
        self.defrag_btn.Bind(wx.EVT_BUTTON, self._on_defrag_list)
        controls_sizer.Add(self.defrag_btn, 0, wx.ALL, 5)

        controls_sizer.AddStretchSpacer()

        # Import/Export section
        import_export_label = wx.StaticText(self, label="Import/Export:")
        controls_sizer.Add(import_export_label, 0, wx.ALIGN_CENTER_VERTICAL | wx.ALL, 5)

        self.import_btn = wx.Button(self, label="Import CSV")
        self.import_btn.Bind(wx.EVT_BUTTON, self._on_import_csv)
        controls_sizer.Add(self.import_btn, 0, wx.ALL, 5)

        self.export_csv_btn = wx.Button(self, label="Export CSV")
        self.export_csv_btn.Bind(wx.EVT_BUTTON, self._on_export_csv)
        controls_sizer.Add(self.export_csv_btn, 0, wx.ALL, 5)

        self.export_excel_btn = wx.Button(self, label="Export Excel")
        self.export_excel_btn.Bind(wx.EVT_BUTTON, self._on_export_excel)
        controls_sizer.Add(self.export_excel_btn, 0, wx.ALL, 5)

        list_sizer.Add(controls_sizer, 0, wx.EXPAND | wx.ALL, 5)

        # List display
        self.list_ctrl = wx.ListCtrl(
            self, style=wx.LC_REPORT | wx.LC_EDIT_LABELS | wx.LC_SINGLE_SEL
        )

        # Add columns
        self.list_ctrl.InsertColumn(0, "Item", width=250)
        self.list_ctrl.InsertColumn(1, "Qty", width=60)
        self.list_ctrl.InsertColumn(2, "Status", width=80)
        self.list_ctrl.InsertColumn(3, "Notes", width=150)
        self.list_ctrl.InsertColumn(4, "Actions", width=120)

        list_sizer.Add(self.list_ctrl, 1, wx.EXPAND | wx.ALL, 5)

        # Summary section
        summary_box = wx.StaticBox(self, label="Summary")
        summary_sizer = wx.StaticBoxSizer(summary_box, wx.HORIZONTAL)

        self.total_items_text = wx.StaticText(self, label="Total Items: 0")
        summary_sizer.Add(self.total_items_text, 0, wx.ALL, 5)

        self.completed_items_text = wx.StaticText(self, label="Completed: 0")
        summary_sizer.Add(self.completed_items_text, 0, wx.ALL, 5)

        self.pending_items_text = wx.StaticText(self, label="Pending: 0")
        summary_sizer.Add(self.pending_items_text, 0, wx.ALL, 5)

        summary_sizer.AddStretchSpacer()

        self.estimated_cost_text = wx.StaticText(self, label="Estimated Cost: N/A")
        summary_sizer.Add(self.estimated_cost_text, 0, wx.ALL, 5)

        list_sizer.Add(summary_sizer, 0, wx.EXPAND | wx.ALL, 5)

        main_sizer.Add(list_sizer, 1, wx.EXPAND | wx.ALL, 10)

        # Set main sizer
        self.SetSizer(main_sizer)

        # Bind events
        self._bind_events()

    def refresh(self) -> None:
        """Refresh the shopping list display."""
        try:
            # Clear current list
            self.list_ctrl.DeleteAllItems()

            # Get shopping list from service
            self.shopping_list = self.client_service.get_shopping_list()

            # Populate list control
            for i, item in enumerate(self.shopping_list):
                # Item name
                self.list_ctrl.InsertItem(i, item.get("name", "Unknown"))

                # Quantity
                self.list_ctrl.SetItem(i, 1, str(item.get("quantity", 1)))

                # Status
                status = "Completed" if item.get("completed", False) else "Pending"
                self.list_ctrl.SetItem(i, 2, status)

                # Notes
                notes = item.get("notes", "")
                self.list_ctrl.SetItem(
                    i, 3, notes[:50] + "..." if len(notes) > 50 else notes
                )

                # Actions
                actions = "Toggle | Remove"
                self.list_ctrl.SetItem(i, 4, actions)

                # Store item data
                self.list_ctrl.SetItemData(i, i)

            # Update summary and button states
            self._update_summary()
            self._update_button_states()

        except Exception as e:
            wx.MessageBox(
                f"Error refreshing shopping list: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _update_summary(self) -> None:
        """Update the summary display."""
        total_items = len(self.shopping_list)
        completed_items = sum(
            1 for item in self.shopping_list if item.get("completed", False)
        )
        pending_items = total_items - completed_items

        self.total_items_text.SetLabel(f"Total Items: {total_items}")
        self.completed_items_text.SetLabel(f"Completed: {completed_items}")
        self.pending_items_text.SetLabel(f"Pending: {pending_items}")

    def _update_button_states(self) -> None:
        """Update button states based on current data."""
        has_items = len(self.shopping_list) > 0
        has_completed = any(item.get("completed", False) for item in self.shopping_list)
        is_authenticated = self.client_service.is_authenticated()

        self.clear_completed_btn.Enable(has_completed and is_authenticated)
        self.estimate_btn.Enable(has_items and is_authenticated)
        self.defrag_btn.Enable(has_items and is_authenticated)
        self.export_csv_btn.Enable(has_items)
        self.export_excel_btn.Enable(has_items)

        # Enable/disable add functionality based on authentication
        self.add_btn.Enable(is_authenticated)
        self.item_name.Enable(is_authenticated)
        self.item_quantity.Enable(is_authenticated)
        self.item_notes.Enable(is_authenticated)
        self.import_btn.Enable(is_authenticated)

    def _on_add_item(self, event: wx.CommandEvent) -> None:
        """Handle add item button click."""
        name = self.item_name.GetValue().strip()
        quantity = self.item_quantity.GetValue()
        notes = self.item_notes.GetValue().strip()

        if not name:
            wx.MessageBox("Please enter an item name", "Error", wx.OK | wx.ICON_ERROR)
            return

        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to add items to your shopping list",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        try:
            if self.client_service.add_shopping_list_item(name, quantity, notes):
                wx.MessageBox(
                    f"Added {name} to shopping list",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
                self.item_name.SetValue("")
                self.item_quantity.SetValue(1)
                self.item_notes.SetValue("")
                self.refresh()
            else:
                wx.MessageBox(
                    "Failed to add item to shopping list",
                    "Error",
                    wx.OK | wx.ICON_ERROR,
                )
        except Exception as e:
            wx.MessageBox(f"Error adding item: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_refresh(self, event: wx.CommandEvent) -> None:
        """Handle refresh button click."""
        self.refresh()

    def _on_clear_completed(self, event: wx.CommandEvent) -> None:
        """Handle clear completed button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your shopping list",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        # Get completed items
        completed_items = [
            item for item in self.shopping_list if item.get("completed", False)
        ]

        if not completed_items:
            wx.MessageBox(
                "No completed items to clear", "Info", wx.OK | wx.ICON_INFORMATION
            )
            return

        # Confirm action
        result = wx.MessageBox(
            f"Clear {len(completed_items)} completed items?",
            "Confirm",
            wx.YES_NO | wx.ICON_QUESTION,
        )

        if result == wx.YES:
            try:
                # Remove completed items
                for item in completed_items:
                    self.client_service.remove_shopping_list_item(item["id"])

                wx.MessageBox(
                    "Cleared completed items", "Success", wx.OK | wx.ICON_INFORMATION
                )
                self.refresh()
            except Exception as e:
                wx.MessageBox(
                    f"Error clearing completed items: {e}",
                    "Error",
                    wx.OK | wx.ICON_ERROR,
                )

    def _on_estimate_cost(self, event: wx.CommandEvent) -> None:
        """Handle estimate cost button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to estimate shopping list cost",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        try:
            result = self.client_service.estimate_shopping_list_cost()

            if "error" in result:
                wx.MessageBox(
                    f"Error estimating cost: {result['error']}",
                    "Error",
                    wx.OK | wx.ICON_ERROR,
                )
            else:
                message = f"Total Items: {result['total_items']}\n"
                if result.get("estimated_total"):
                    message += f"Estimated Total: ${result['estimated_total']:.2f}\n"
                else:
                    message += f"Message: {result.get('message', 'N/A')}"

                wx.MessageBox(
                    message,
                    "Cost Estimation",
                    wx.OK | wx.ICON_INFORMATION,
                )
        except Exception as e:
            wx.MessageBox(f"Error estimating cost: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_defrag_list(self, event: wx.CommandEvent) -> None:
        """Handle defrag list button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to defragment your shopping list",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        try:
            if self.client_service.defrag_shopping_list():
                wx.MessageBox(
                    "Shopping list defragmentation completed",
                    "Success",
                    wx.OK | wx.ICON_INFORMATION,
                )
                self.refresh()
            else:
                wx.MessageBox(
                    "Failed to defragment shopping list",
                    "Error",
                    wx.OK | wx.ICON_ERROR,
                )
        except Exception as e:
            wx.MessageBox(
                f"Error defragmenting list: {e}", "Error", wx.OK | wx.ICON_ERROR
            )

    def _on_import_csv(self, event: wx.CommandEvent) -> None:
        """Handle import CSV button click."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to import shopping list items",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        try:
            with wx.FileDialog(
                self,
                "Import Shopping List from CSV",
                wildcard="CSV files (*.csv)|*.csv",
                style=wx.FD_OPEN | wx.FD_FILE_MUST_EXIST,
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.import_shopping_list_from_csv(filepath):
                        wx.MessageBox(
                            f"Shopping list imported from {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to import shopping list",
                            "Error",
                            wx.OK | wx.ICON_ERROR,
                        )
        except Exception as e:
            wx.MessageBox(f"Error importing CSV: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_export_csv(self, event: wx.CommandEvent) -> None:
        """Handle export CSV button click."""
        if not self.shopping_list:
            wx.MessageBox(
                "No shopping list items to export", "Info", wx.OK | wx.ICON_INFORMATION
            )
            return

        try:
            with wx.FileDialog(
                self,
                "Export Shopping List to CSV",
                wildcard="CSV files (*.csv)|*.csv",
                defaultFile="meijer_shopping_list.csv",
                style=wx.FD_SAVE | wx.FD_OVERWRITE_PROMPT,
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_shopping_list_to_csv(filepath):
                        wx.MessageBox(
                            f"Shopping list exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export shopping list",
                            "Error",
                            wx.OK | wx.ICON_ERROR,
                        )
        except Exception as e:
            wx.MessageBox(f"Error exporting CSV: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_export_excel(self, event: wx.CommandEvent) -> None:
        """Handle export Excel button click."""
        if not self.shopping_list:
            wx.MessageBox(
                "No shopping list items to export", "Info", wx.OK | wx.ICON_INFORMATION
            )
            return

        try:
            with wx.FileDialog(
                self,
                "Export Shopping List to Excel",
                wildcard="Excel files (*.xlsx)|*.xlsx",
                defaultFile="meijer_shopping_list.xlsx",
                style=wx.FD_SAVE | wx.FD_OVERWRITE_PROMPT,
            ) as fileDialog:
                if fileDialog.ShowModal() == wx.ID_OK:
                    filepath = fileDialog.GetPath()

                    if self.client_service.export_shopping_list_to_excel(filepath):
                        wx.MessageBox(
                            f"Shopping list exported to {filepath}",
                            "Success",
                            wx.OK | wx.ICON_INFORMATION,
                        )
                    else:
                        wx.MessageBox(
                            "Failed to export shopping list",
                            "Error",
                            wx.OK | wx.ICON_ERROR,
                        )
        except Exception as e:
            wx.MessageBox(f"Error exporting Excel: {e}", "Error", wx.OK | wx.ICON_ERROR)

    def _on_list_item_activated(self, event: wx.ListEvent) -> None:
        """Handle list item activation (double-click)."""
        item_index = event.GetIndex()
        if item_index >= 0 and item_index < len(self.shopping_list):
            item = self.shopping_list[item_index]
            self._show_item_dialog(item)

    def _show_item_dialog(self, item: dict[str, Any]) -> None:
        """Show dialog for item actions."""
        if not self.client_service.is_authenticated():
            wx.MessageBox(
                "Please login to manage your shopping list",
                "Error",
                wx.OK | wx.ICON_ERROR,
            )
            return

        # Create action dialog
        dialog = wx.SingleChoiceDialog(
            self,
            f"Choose action for '{item.get('name', 'Unknown')}':",
            "Item Actions",
            ["Toggle Completion", "Remove Item", "Cancel"],
        )

        if dialog.ShowModal() == wx.ID_OK:
            choice = dialog.GetSelection()

            if choice == 0:  # Toggle completion
                if self.client_service.toggle_shopping_list_item(item["id"]):
                    self.refresh()
                else:
                    wx.MessageBox(
                        "Failed to toggle item completion",
                        "Error",
                        wx.OK | wx.ICON_ERROR,
                    )

            elif choice == 1:  # Remove item
                result = wx.MessageBox(
                    f"Remove '{item.get('name', 'Unknown')}' from shopping list?",
                    "Confirm",
                    wx.YES_NO | wx.ICON_QUESTION,
                )

                if result == wx.YES:
                    if self.client_service.remove_shopping_list_item(item["id"]):
                        self.refresh()
                    else:
                        wx.MessageBox(
                            "Failed to remove item", "Error", wx.OK | wx.ICON_ERROR
                        )

        dialog.Destroy()

    def _bind_events(self) -> None:
        """Bind list control events."""
        self.list_ctrl.Bind(wx.EVT_LIST_ITEM_ACTIVATED, self._on_list_item_activated)
