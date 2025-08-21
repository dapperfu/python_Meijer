package com.bugsnag.android.ndk;

import com.bugsnag.android.C6624v0;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "", "json", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "b", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class OpaqueValue {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String json;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue$a;", "", "<init>", "()V", "", "value", "", "b", "(Ljava/lang/String;)Z", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "INITIAL_BUFFER_SIZE", "I", "MAX_NDK_STRING_LENGTH", "US_ASCII_MAX_CODEPOINT", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.ndk.OpaqueValue$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(Object value) {
            StringWriter stringWriter = new StringWriter(256);
            try {
                new C6624v0(stringWriter).h0(value, false);
                Unit unit = Unit.f143329a;
                CloseableKt.a(stringWriter, null);
                return stringWriter.toString();
            } finally {
            }
        }

        @JvmStatic
        public final Object c(Object value) {
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value;
            }
            boolean z10 = value instanceof String;
            if (z10 && b((String) value)) {
                return value;
            }
            if (z10 || (value instanceof Map) || (value instanceof Collection) || (value instanceof Object[])) {
                return new OpaqueValue(a(value));
            }
            return null;
        }

        public final boolean b(String value) {
            if (value.length() >= 64) {
                return false;
            }
            int i10 = 0;
            while (i10 < value.length()) {
                char cCharAt = value.charAt(i10);
                i10++;
                if (cCharAt > 127) {
                    byte[] bytes = value.getBytes(Charsets.UTF_8);
                    Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length >= 64) {
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
    }

    @JvmStatic
    public static final Object makeSafe(Object obj) {
        return INSTANCE.c(obj);
    }

    public final String getJson() {
        return this.json;
    }

    public OpaqueValue(String str) {
        this.json = str;
    }
}
