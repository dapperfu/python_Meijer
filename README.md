# 🛒 Meijer CLI Tool

A comprehensive command-line interface for managing your Meijer shopping lists with powerful features like defrag organization, interactive TUI, and batch operations.

## ✨ Features

- **📋 Shopping List Management**: Add, remove, and organize items
- **🔍 Product Search**: Automatic product matching with location data
- **🏪 Aisle Organization**: Defrag functionality to organize by store layout
- **⭐ Favorites Integration**: Add items from your favorites list
- **📁 Batch Operations**: Add multiple items from files or stdin
- **🎮 Interactive Mode**: Rich TUI for easy list management
- **📊 Beautiful Tables**: Professional CLI output with tabulate
- **🔐 Authentication**: Multiple auth methods (bearer token, OAuth, etc.)

## 🚀 Quick Start

### Installation

```bash
# Install the CLI tool
pip install -e .

# Verify installation
meijer --version
```

### Basic Usage

```bash
# Show your shopping list
meijer list show

# Add an item
meijer list add "Milk"

# Add by UPC
meijer list add 0123456789

# Organize by aisle (defrag)
meijer list defrag
```

## 📖 Command Reference

### Shopping List Commands

#### `meijer list show`
Display your current shopping list.

**Options:**
- `--completed`: Show only completed items
- `--pending`: Show only pending items

**Examples:**
```bash
meijer list show                    # Show all items
meijer list show --completed        # Show only completed items
meijer list show --pending          # Show only pending items
```

#### `meijer list add`
Add items to your shopping list.

**Usage:**
```bash
meijer list add "Item Name"         # Add by description
meijer list add 0123456789          # Add by UPC
meijer list add < items.txt         # Add from file
echo "Milk" | meijer list add       # Add from stdin
```

**Options:**
- `--quantity, -q`: Quantity to add (default: 1)
- `--notes, -n`: Additional notes for the item
- `--file, -f`: Read items from specified file

**Examples:**
```bash
meijer list add "Organic Bananas" -q 2 -n "Get yellow ones"
meijer list add -f grocery_list.txt
cat items.txt | meijer list add
```

#### `meijer list favorites`
Show your favorite items.

**Example:**
```bash
meijer list favorites
```

#### `meijer list clear`
Clear completed items from your shopping list.

**Example:**
```bash
meijer list clear
```

#### `meijer list clearall`
Clear ALL items from your shopping list (with confirmation).

**Example:**
```bash
meijer list clearall
```

#### `meijer list defrag`
Organize your shopping list by aisle number for efficient shopping.

**Options:**
- `--store-id`: Specific store ID for location lookup

**Examples:**
```bash
meijer list defrag                   # Defrag with current store
meijer list defrag --store-id 123    # Defrag for specific store
```

**What defrag does:**
1. Searches for each item to find store location
2. Sorts items by ascending aisle number
3. Adds location information to item notes
4. Creates efficient shopping route

#### `meijer list interactive`
Launch interactive TUI for shopping list management.

**Features:**
- Add/remove items
- Mark items complete/incomplete
- Add from favorites
- Defrag list
- Real-time updates

**Requirements:**
```bash
pip install rich  # For enhanced TUI
```

### Utility Commands

#### `meijer status`
Show authentication and connection status.

**Example:**
```bash
meijer status
```

#### `meijer version`
Show version information.

**Example:**
```bash
meijer version
```

## 📁 File Input Examples

### Text File Format
Create a file `grocery_list.txt`:
```text
Milk
Bread
Eggs
Bananas
# This is a comment
Ground Beef
```

### Add from File
```bash
meijer list add < grocery_list.txt
# or
meijer list add -f grocery_list.txt
```

### Pipe from Command
```bash
echo "Milk\nBread\nEggs" | meijer list add
cat grocery_list.txt | meijer list add
```

## 🔧 Configuration

### Authentication
The CLI tool supports multiple authentication methods:

1. **Auth File** (`auth.txt`):
   ```bash
   bearer=your_bearer_token_here
   ```

2. **Config File** (`~/.config/meijer.txt`):
   ```json
   {
     "bearer_token": "your_token_here",
     "user_agent": "Meijer/101200000"
   }
   ```

3. **Environment Variables**:
   ```bash
   export MEIJER_BEARER_TOKEN="your_token_here"
   export MEIJER_USER_AGENT="Meijer/101200000"
   ```

### Store ID
For location-specific features like defrag, you can specify a store ID:
```bash
meijer list defrag --store-id 217
```

## 📊 Output Examples

### Shopping List Display
```
📊 Shopping List (5 items):
+---+----------------------------------------+-----+----------+------------------------------+
| # | Item                                   | Qty | Status   | Notes                        |
+===+========================================+=====+==========+==============================+
| 1 | Milk                                   |   1 | ⏳ Pending| Aisle: 5 | Section: Dairy |
| 2 | Bread                                  |   1 | ⏳ Pending| Aisle: 2 | Section: Bakery|
| 3 | Cereal                                 |   1 | ⏳ Pending| Aisle: 4 | Section: Breakf|
| 4 | Oreos                                  |   1 | ⏳ Pending| Aisle: 4 | Section: Cookie|
| 5 | Ground Turkey                          |   1 | ⏳ Pending| Aisle: 8 | Section: Meat  |
+---+----------------------------------------+-----+----------+------------------------------+
```

### Defrag Process
```
🔧 Starting shopping list defrag...
📊 Product Matching Results:
+-----------------+----------------------------------+-----------+---------+---------+-----------+--------------+
| Original Item   | Closest Match                    | Brand     | Price   |   Aisle | Section   | Confidence   |
+=================+==================================+===========+=========+=========+===========+==============+
| Milk            | Meijer Brand Milk, 2%            | Meijer    | $3.99   |       5 | Dairy     | High         |
| Bread           | Wonder Bread, Classic White      | Wonder    | $2.49   |       2 | Bakery    | High         |
| Cereal          | Kellogg's Frosted Flakes         | Kellogg's | $4.99   |       4 | Breakfast | Medium       |
+-----------------+----------------------------------+-----------+---------+---------+-----------+--------------+
```

## 🛠️ Development

### Installation for Development
```bash
git clone https://github.com/dapperfu/python_Meijer.git
cd python_Meijer
pip install -e ".[dev]"
```

### Running Tests
```bash
python test_defrag.py
python test_tabulate.py
```

### Code Quality
```bash
# Format code
black meijer_cli.py

# Type checking
mypy meijer_cli.py

# Run tests
pytest
```

## 📦 Dependencies

### Required
- `click>=8.0.0`: CLI framework
- `tabulate>=0.9.0`: Table formatting
- `requests>=2.25.0`: HTTP requests
- `urllib3>=1.26.0`: HTTP client

### Optional
- `rich>=12.0.0`: Enhanced TUI (interactive mode)
- `pandas>=1.3.0`: Data analysis
- `jupyter>=1.0.0`: Notebook support

## 🎯 Use Cases

### Daily Shopping
```bash
# Quick add items
meijer list add "Milk"
meijer list add "Bread"

# Organize for shopping
meijer list defrag

# View organized list
meijer list show
```

### Batch Operations
```bash
# Add from recipe
meijer list add -f recipe.txt

# Add from voice notes
echo "Milk, Bread, Eggs" | tr ',' '\n' | meijer list add
```

### List Management
```bash
# Clear completed items
meijer list clear

# Start fresh
meijer list clearall

# Interactive management
meijer list interactive
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🙏 Acknowledgments

- Built with [Click](https://click.palletsprojects.com/) for CLI functionality
- Enhanced with [Tabulate](https://pypi.org/project/tabulate/) for beautiful tables
- Interactive mode powered by [Rich](https://rich.readthedocs.io/)
- Meijer API integration for shopping list management

---

**Happy organized shopping! 🛒✨**
