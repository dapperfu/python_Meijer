# Security Guidelines

## 🚨 CRITICAL: Never Commit Sensitive Files

This repository contains **source code only**. The following file types are **NEVER** to be committed:

### ❌ Forbidden Files
- **Network logs** (`*.log`, `*_mitm.log`, `*.pcap`) - Contain real network traffic and authentication data
- **APK files** (`*.apk`, `*.dex`) - Contain sensitive decompiled app data
- **Analysis reports** (`*_analysis_report.json`) - May contain extracted tokens or sensitive data
- **Binary files** (`*.so`, `*.bin`, `*.obj`) - Not source code
- **Files larger than 1MB** - Automatically blocked by pre-commit hook

### ✅ Safe Files
- Python source code (`.py`)
- Configuration files (`.md`, `.txt`, `.yml`)
- Documentation
- Test files
- Small data files (< 1MB)

## 🔒 Security Measures

### Pre-commit Hook
- **File size limit**: 1MB maximum
- **File type checking**: Blocks sensitive file extensions
- **Automatic validation**: Runs before every commit

### .gitignore Protection
- Comprehensive patterns for sensitive files
- Multiple variations of dangerous file types
- Protection against accidental commits

## 🚫 Why These Files Are Dangerous

### Mitmproxy Logs
- **Real network traffic**: Contains actual HTTP requests/responses
- **Authentication tokens**: May include Bearer tokens, cookies, session data
- **Personal information**: Could contain user data, account details
- **API endpoints**: Reveals internal API structure and parameters

### APK Files
- **Decompiled source**: Contains proprietary app logic
- **Binary data**: Not human-readable source code
- **Large size**: Bloat repository unnecessarily
- **Security risk**: May contain embedded secrets or keys

### Analysis Reports
- **Extracted data**: May contain tokens from network analysis
- **Sensitive metadata**: Could reveal user behavior patterns
- **API insights**: Might expose internal system details

## 🛡️ Best Practices

1. **Always use the pre-commit hook** - Don't bypass it
2. **Check file contents** before committing
3. **Use .gitignore** for temporary files
4. **Report security issues** immediately
5. **Keep repository clean** - Source code only

## 🚨 Emergency Response

If sensitive files are accidentally committed:

1. **Immediate action**: Remove from git history using `git filter-repo`
2. **Security audit**: Review what was exposed
3. **Token rotation**: If tokens were exposed, rotate them immediately
4. **Documentation**: Update this file with lessons learned

## 📞 Security Contacts

- **Repository owner**: Primary security contact
- **Contributors**: Report any security concerns
- **Emergency**: Use GitHub security advisories for critical issues

---

**Remember**: This is a source code repository, not a data dump. Keep it clean, secure, and professional. 