package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/b1;", "", "<init>", "(Ljava/lang/String;I)V", "e", "a", "b", "c", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public enum b1 {
    ALWAYS,
    UNHANDLED_ONLY,
    NEVER;


    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/b1$a;", "", "<init>", "()V", "", "str", "Lcom/bugsnag/android/b1;", "a", "(Ljava/lang/String;)Lcom/bugsnag/android/b1;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.b1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b1 a(String str) {
            b1 b1Var;
            b1[] b1VarArrValues = b1.values();
            int length = b1VarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    b1Var = b1VarArrValues[i10];
                    if (Intrinsics.e(b1Var.name(), str)) {
                        break;
                    }
                    i10++;
                } else {
                    b1Var = null;
                    break;
                }
            }
            if (b1Var != null) {
                return b1Var;
            }
            return b1.ALWAYS;
        }
    }
}
