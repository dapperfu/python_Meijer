package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/Severity;", "", "Lcom/bugsnag/android/v0$a;", "", "str", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "Ljava/lang/String;", "Companion", "a", "ERROR", "WARNING", "INFO", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public enum Severity implements C6624v0.a {
    ERROR("error"),
    WARNING("warning"),
    INFO("info");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String str;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/Severity$a;", "", "<init>", "()V", "", "desc", "Lcom/bugsnag/android/Severity;", "a", "(Ljava/lang/String;)Lcom/bugsnag/android/Severity;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.Severity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Severity a(String desc) {
            Severity[] severityArrValues = Severity.values();
            int length = severityArrValues.length;
            int i10 = 0;
            while (i10 < length) {
                Severity severity = severityArrValues[i10];
                i10++;
                if (Intrinsics.e(severity.str, desc)) {
                    return severity;
                }
            }
            return null;
        }
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.O(this.str);
    }

    Severity(String str) {
        this.str = str;
    }
}
