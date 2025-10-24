# Requirements Management with Doorstop

This directory contains the requirements management system for the Meijer CLI project using [Doorstop](https://doorstop.readthedocs.io/).

## Document Hierarchy

The requirements are organized in a three-level hierarchy:

```
SYS (System Requirements)
  └── SRS (Software Requirements)
      └── TEST (Test Cases)
```

### Document Types

- **SYS** (`sys/`): High-level system requirements and business objectives
- **SRS** (`srs/`): Detailed software requirements derived from system requirements
- **TEST** (`test/`): Test cases and validation criteria for software requirements

## Getting Started

### 1. Initialize Requirements (One-time Setup)

```bash
make reqs-init
```

This creates the document hierarchy and initial configuration files.

### 2. Add Requirements

```bash
# Add a system requirement
make reqs-add
# Select SYS when prompted

# Add a software requirement  
make reqs-add
# Select SRS when prompted

# Add a test case
make reqs-add
# Select TEST when prompted
```

### 3. View Requirements Structure

```bash
# View the document tree
make reqs-tree

# Validate requirement links
make reqs-validate
```

## File Structure

```
reqs/
├── sys/                    # System Requirements (SYS)
│   ├── .doorstop.yml      # Document configuration
│   ├── SYS001.yml         # Individual requirements
│   ├── SYS002.yml
│   └── ...
├── srs/                   # Software Requirements (SRS)
│   ├── .doorstop.yml      # Document configuration
│   ├── SRS001.yml         # Individual requirements
│   ├── SRS002.yml
│   └── ...
└── test/                  # Test Cases (TEST)
    ├── .doorstop.yml      # Document configuration
    ├── TEST001.yml        # Individual test cases
    ├── TEST002.yml
    └── ...
```

## Requirement ID Format

- **System Requirements**: `SYS001`, `SYS002`, `SYS003`, etc.
- **Software Requirements**: `SRS001`, `SRS002`, `SRS003`, etc.
- **Test Cases**: `TEST001`, `TEST002`, `TEST003`, etc.

## Commands Reference

### Setup Commands
- `make reqs-init`: Initialize doorstop structure (one-time)
- `make reqs-help`: Show all available commands

### Management Commands
- `make reqs-add`: Add new requirement (interactive)
- `make reqs-edit`: Edit existing requirements
- `make reqs-validate`: Validate requirement links and consistency

### Export Commands
- `make reqs-export`: Export to HTML/Markdown/CSV/YAML
- `make reqs-publish`: Generate and publish requirement docs

### Information Commands
- `make reqs-tree`: View document tree structure

## Writing Requirements

### System Requirements (SYS)
- High-level business objectives
- User needs and constraints
- System boundaries and interfaces
- Performance and reliability requirements

### Software Requirements (SRS)
- Detailed functional requirements
- Non-functional requirements
- Interface specifications
- Data requirements

### Test Cases (TEST)
- Test scenarios and procedures
- Expected results
- Test data requirements
- Validation criteria

## Linking Requirements

### Parent-Child Relationships
- SRS requirements should reference parent SYS requirements
- TEST cases should reference parent SRS requirements
- Use doorstop's built-in linking mechanisms

### Code References
- Reference requirements by ID in code comments
- Example: `# Implements SRS001: User authentication`
- Link test cases to specific requirements

## Migration from Existing Requirements

The existing requirements in the `requirements/` directory remain unchanged. New requirements are added to doorstop. Gradual migration can be done over time by:

1. Adding existing requirements to doorstop
2. Linking them to code implementations
3. Creating test cases for validation
4. Eventually retiring old requirement files

## StrictDoc Compatibility

This project uses doorstop as the primary requirements management tool while maintaining compatibility with StrictDoc:

- Export doorstop documents to formats compatible with StrictDoc
- Use StrictDoc grammar rules when generating StrictDoc files
- Maintain parallel documentation where necessary

## Best Practices

### Requirement Writing
1. **Clear and Testable**: Write requirements that can be verified
2. **Consistent Terminology**: Use the same terms throughout
3. **Acceptance Criteria**: Include clear success criteria
4. **Traceability**: Link requirements to implementation and tests

### Document Management
1. **Regular Validation**: Run `make reqs-validate` frequently
2. **Version Control**: Commit requirement changes with descriptive messages
3. **Export Documentation**: Generate documentation for stakeholders
4. **Review Process**: Establish review cycles for requirement changes

### Integration with Development
1. **Code Comments**: Reference requirements in implementation
2. **Test Coverage**: Ensure test cases cover all requirements
3. **Change Management**: Update requirements when features change
4. **Documentation**: Keep requirement documentation current

## Troubleshooting

### Common Issues

**Validation Errors**: Run `make reqs-validate` to check for broken links or missing references.

**Missing Requirements**: Use `make reqs-tree` to see the current structure and identify gaps.

**Export Problems**: Ensure the export directory exists and has proper permissions.

### Getting Help

- Run `make reqs-help` for command reference
- Check doorstop documentation: https://doorstop.readthedocs.io/
- Review the project's `.cursor/rules/requirements_management.mdc` for conventions

## Examples

### Adding a System Requirement

```bash
make reqs-add
# Select: SYS
# Enter requirement text: "The system shall provide secure user authentication"
# Add acceptance criteria: "Users can log in with valid credentials"
```

### Adding a Software Requirement

```bash
make reqs-add
# Select: SRS
# Enter requirement text: "Implement OAuth 2.0 authentication flow"
# Link to parent: SYS001
# Add technical details: "Use JWT tokens for session management"
```

### Adding a Test Case

```bash
make reqs-add
# Select: TEST
# Enter test description: "Verify OAuth 2.0 login flow"
# Link to parent: SRS001
# Add test steps: "1. Initiate login 2. Complete OAuth flow 3. Verify token"
```
