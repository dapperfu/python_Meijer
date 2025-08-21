package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public enum BreadcrumbType {
    ERROR("error"),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION("navigation"),
    PROCESS("process"),
    REQUEST("request"),
    STATE("state"),
    USER("user");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String type;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/BreadcrumbType$a;", "", "<init>", "()V", "", "type", "Lcom/bugsnag/android/BreadcrumbType;", "a", "(Ljava/lang/String;)Lcom/bugsnag/android/BreadcrumbType;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.BreadcrumbType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BreadcrumbType a(String type) {
            BreadcrumbType[] breadcrumbTypeArrValues = BreadcrumbType.values();
            int length = breadcrumbTypeArrValues.length;
            int i10 = 0;
            BreadcrumbType breadcrumbType = null;
            boolean z10 = false;
            while (i10 < length) {
                BreadcrumbType breadcrumbType2 = breadcrumbTypeArrValues[i10];
                i10++;
                if (Intrinsics.e(breadcrumbType2.type, type)) {
                    if (z10) {
                        return null;
                    }
                    z10 = true;
                    breadcrumbType = breadcrumbType2;
                }
            }
            if (!z10) {
                return null;
            }
            return breadcrumbType;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    BreadcrumbType(String str) {
        this.type = str;
    }
}
