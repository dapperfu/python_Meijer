package Yv;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/logging/LogRecord;", "", "b", "(Ljava/util/logging/LogRecord;)I", "androidLevel", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == level.intValue()) {
            return 4;
        }
        return 3;
    }
}
