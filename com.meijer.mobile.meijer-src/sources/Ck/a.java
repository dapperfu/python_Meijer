package Ck;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"LCk/a;", "", "<init>", "()V", "", "remindLaterTimePrompted", "", "d", "(J)Z", "", "percentageChance", "c", "(I)Z", "lastPromptTime", "b", "versionRated", "appVersion", "e", "(II)Z", "promptingEnabled", "appPromptPercentage", "noThanksDoNotPromptTime", "userDoNotPromptVersion", "rateAppVersionPerformed", "emailFeedbackSent", "a", "(ZIJIJIII)Z", "J", "MIN_TIME_FOR_RATE_APP_RE_PROMPT", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5180a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long MIN_TIME_FOR_RATE_APP_RE_PROMPT = TimeUnit.DAYS.toMillis(30);

    private final boolean b(long lastPromptTime) {
        return lastPromptTime + MIN_TIME_FOR_RATE_APP_RE_PROMPT < System.currentTimeMillis();
    }

    private final boolean c(int percentageChance) {
        return RangesKt.u(new IntRange(0, 100), Random.INSTANCE) <= percentageChance;
    }

    private final boolean d(long remindLaterTimePrompted) {
        if (remindLaterTimePrompted != 0) {
            return b(remindLaterTimePrompted);
        }
        return true;
    }

    private final boolean e(int versionRated, int appVersion) {
        return versionRated == appVersion;
    }

    public final boolean a(boolean promptingEnabled, int appPromptPercentage, long noThanksDoNotPromptTime, int userDoNotPromptVersion, long remindLaterTimePrompted, int rateAppVersionPerformed, int emailFeedbackSent, int appVersion) {
        return promptingEnabled && c(appPromptPercentage) && noThanksDoNotPromptTime == 0 && userDoNotPromptVersion != appVersion && !e(rateAppVersionPerformed, appVersion) && emailFeedbackSent != appVersion && d(remindLaterTimePrompted);
    }

    private a() {
    }
}
