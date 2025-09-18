# LEGO Price Collection Cron Job Setup

This guide explains how to set up automated LEGO price collection using cron jobs.

## 🎯 Overview

The cron job automatically runs the LEGO price collection script at scheduled intervals, collecting real-time prices from Meijer and storing them in the database for price trend analysis.

## 📁 Files Created

- `cron_lego_price_collector.sh` - Main cron script with logging and error handling
- `setup_cron_job.py` - Interactive setup script
- `cron_schedule_examples.txt` - Various cron schedule examples
- `CRON_SETUP_README.md` - This documentation

## 🚀 Quick Setup

### Option 1: Interactive Setup (Recommended)
```bash
cd /projects/python_Meijer/meijer-price-monitor
python setup_cron_job.py
```

### Option 2: Manual Setup
```bash
# Edit crontab
crontab -e

# Add one of these lines:
# Daily at 6:00 AM
0 6 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh

# Twice daily (6 AM and 6 PM)
0 6,18 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

## 📅 Recommended Schedules

### 🏆 **Best for LEGO Monitoring**
```bash
# Daily at 6:00 AM (before store opens)
0 6 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

### 🔥 **High-Frequency Monitoring**
```bash
# Twice daily: 6:00 AM and 6:00 PM
0 6,18 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh

# Every 6 hours (4 times per day)
0 */6 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

### 🎯 **Weekend Focus** (LEGO sales often happen on weekends)
```bash
# Saturday and Sunday at 8:00 AM
0 8 * * 0,6 /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

### 🧪 **Testing/Development**
```bash
# Every hour during business hours (8 AM - 8 PM)
0 8-20 * * * /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

## 📊 Logging and Monitoring

### Log Files
- **Location**: `/projects/python_Meijer/logs/cron/`
- **Format**: `lego_price_collection_YYYYMMDD.log`
- **Example**: `lego_price_collection_20241219.log`

### Log Content
Each log entry includes:
- Timestamp
- Collection status (success/failure)
- Number of products collected
- Price drop analysis
- Error messages (if any)

### Example Log Output
```
[2024-12-19 06:00:01] 🚀 Starting automated LEGO price collection...
[2024-12-19 06:00:02] ✅ LEGO price collection completed successfully
[2024-12-19 06:00:03] 📊 Collection Summary: 5 collected, 0 failed, 5 total
[2024-12-19 06:00:04] 🔍 Checking for significant price drops...
[2024-12-19 06:00:05] ✅ Price drop analysis completed
[2024-12-19 06:00:06] 🏁 Automated LEGO price collection session completed
```

## 🔧 Cron Job Features

### ✅ **Built-in Features**
- **Automatic Logging**: All output logged with timestamps
- **Error Handling**: Graceful failure handling with notifications
- **Virtual Environment**: Automatically activates Python venv
- **Path Management**: Handles absolute paths correctly
- **Status Reporting**: Collection statistics and success/failure status

### 📈 **Price Drop Detection**
The cron job automatically:
- Collects current LEGO prices
- Compares with historical data
- Identifies products with 20%+ price drops
- Logs significant price changes

### 🔔 **Notifications** (Extensible)
The script includes notification hooks for:
- Email alerts
- Slack messages
- Custom webhooks
- System notifications

## 🛠️ Troubleshooting

### Check Cron Status
```bash
# View current crontab
crontab -l

# Check cron service status
sudo systemctl status cron

# View cron logs
sudo journalctl -u cron
```

### Test Script Manually
```bash
# Run the cron script manually
/projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh

# Check script permissions
ls -la /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

### Common Issues

**❌ "Permission denied"**
```bash
chmod +x /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
```

**❌ "Virtual environment not found"**
```bash
# Ensure venv exists
ls -la /projects/python_Meijer/meijer-price-monitor/venv/
```

**❌ "Cron not running"**
```bash
# Start cron service
sudo systemctl start cron
sudo systemctl enable cron
```

## 📋 Cron Time Format

```
* * * * *
│ │ │ │ │
│ │ │ │ └── Day of week (0-7, 0=Sunday)
│ │ │ └──── Month (1-12)
│ │ └────── Day of month (1-31)
│ └──────── Hour (0-23)
└────────── Minute (0-59)
```

### Examples
- `0 6 * * *` = Every day at 6:00 AM
- `0 6,18 * * *` = Every day at 6:00 AM and 6:00 PM
- `*/30 8-20 * * *` = Every 30 minutes from 8 AM to 8 PM
- `0 6 * * 1-5` = Weekdays only at 6:00 AM
- `0 6 1 * *` = First day of every month at 6:00 AM

## 🎯 Best Practices

### 1. **Start Conservative**
Begin with daily collection, then increase frequency based on needs.

### 2. **Monitor Logs**
Check logs regularly to ensure collection is working properly.

### 3. **Respect Rate Limits**
Don't set cron jobs too frequently to avoid overwhelming the Meijer API.

### 4. **Backup Database**
Regularly backup your price database:
```bash
cp /projects/python_Meijer/meijer-price-monitor/price_data/prices.db /backup/prices_$(date +%Y%m%d).db
```

### 5. **Test Before Production**
Always test the cron script manually before setting up automated runs.

## 🚀 Getting Started

1. **Run the setup script**:
   ```bash
   cd /projects/python_Meijer/meijer-price-monitor
   python setup_cron_job.py
   ```

2. **Choose your schedule** (recommended: daily at 6 AM)

3. **Test the setup**:
   ```bash
   /projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh
   ```

4. **Monitor logs**:
   ```bash
   tail -f /projects/python_Meijer/logs/cron/lego_price_collection_$(date +%Y%m%d).log
   ```

5. **Check database**:
   ```bash
   sqlite3 /projects/python_Meijer/meijer-price-monitor/price_data/prices.db "SELECT COUNT(*) FROM price_records;"
   ```

## 🎉 Success!

Once set up, your LEGO price collection will run automatically, building a comprehensive price history database perfect for your CamelCamelCamel-like monitoring system!

**Next Steps:**
- Set up price drop alerts
- Create a web dashboard
- Expand to other product categories
- Implement automated notifications
