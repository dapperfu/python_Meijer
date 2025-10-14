# Documentation

This directory contains comprehensive documentation for the Meijer API Client project, covering traffic capture, Android proxy setup, and integration workflows.

## Documentation Overview

### Core Documentation

- **[Makefile Logging Documentation](MAKEFILE_LOGGING.md)** - Complete guide to using Makefile commands for traffic capture and analysis
- **[Android WiFi Proxy Setup Guide](ANDROID_PROXY_SETUP.md)** - Step-by-step instructions for configuring Android devices to use proxy servers
- **[Traffic Capture Integration Guide](TRAFFIC_CAPTURE_INTEGRATION.md)** - Complete workflow combining Makefile logging with Android proxy configuration

### Quick Start

For immediate setup:

1. **Start Proxy Server**:
   ```bash
   make log
   ```

2. **Configure Android Device**:
   - Set WiFi proxy to your development machine's IP:8080
   - Install mitmproxy certificate from `mitm.it`

3. **Capture Traffic**:
   - Use Meijer app on Android device
   - Perform actions (login, browse, add to cart)

4. **Extract Authentication**:
   ```bash
   make auth
   ```

### Documentation Structure

```
docs/
├── MAKEFILE_LOGGING.md              # Makefile command documentation
├── ANDROID_PROXY_SETUP.md           # Android proxy configuration
├── TRAFFIC_CAPTURE_INTEGRATION.md   # Complete integration workflow
└── README.md                        # This file
```

## Key Features Documented

### Makefile Commands

- `make log` - Start mitmweb traffic capture
- `make logs` - View available log files
- `make auth` - Extract authentication tokens
- `make auth FILE=logfile.log` - Extract from specific log file

### Android Configuration

- WiFi proxy setup for different Android versions
- Certificate installation for HTTPS interception
- Troubleshooting common configuration issues
- Alternative methods for problematic devices

### Integration Workflow

- Complete step-by-step setup process
- Troubleshooting integration issues
- Advanced scenarios and automation
- Best practices for security and performance

## Prerequisites

Before using the documentation:

1. **mitmproxy installed** on development machine
2. **Virtual environment activated** (`venv`)
3. **Network access** between development machine and Android device
4. **Meijer mobile app** installed on Android device

## Getting Started

1. **Read the Integration Guide**: Start with [Traffic Capture Integration Guide](TRAFFIC_CAPTURE_INTEGRATION.md) for the complete workflow
2. **Follow Android Setup**: Use [Android WiFi Proxy Setup Guide](ANDROID_PROXY_SETUP.md) for device configuration
3. **Reference Makefile Commands**: Consult [Makefile Logging Documentation](MAKEFILE_LOGGING.md) for command details

## Troubleshooting

Each documentation file includes troubleshooting sections:

- **Common Issues**: Frequently encountered problems and solutions
- **Advanced Troubleshooting**: Debug techniques and diagnostic commands
- **Device-Specific Notes**: Android version-specific considerations
- **Security Considerations**: Best practices for secure operation

## Support

For additional help:

1. **Check Documentation**: Review all relevant guides
2. **Use Troubleshooting Sections**: Follow diagnostic steps
3. **Check Project Issues**: Review GitHub issues for similar problems
4. **Provide Context**: Include relevant log files and configuration details

## Contributing

When updating documentation:

1. **Follow Format**: Maintain consistent structure and formatting
2. **Include Examples**: Provide practical examples and code snippets
3. **Update Cross-References**: Ensure links between documents remain current
4. **Test Instructions**: Verify all steps work as documented
5. **Security Review**: Ensure security considerations are addressed

## Related Resources

- **Project README**: Main project documentation
- **API Documentation**: Generated API documentation
- **Development Workflow**: Development process documentation
- **Troubleshooting Guide**: General troubleshooting resources