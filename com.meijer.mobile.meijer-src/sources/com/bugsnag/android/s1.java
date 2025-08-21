package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C6624v0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0015B-\b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/s1;", "Lcom/bugsnag/android/v0$a;", "", PreferencesHelper.PREF_ID, "email", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class s1 implements C6624v0.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/s1$a;", "", "Lcom/bugsnag/android/s1;", "<init>", "()V", "Landroid/util/JsonReader;", "reader", "a", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/s1;", "", "KEY_EMAIL", "Ljava/lang/String;", "KEY_ID", "KEY_NAME", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.s1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public s1 a(JsonReader reader) throws IOException {
            reader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                String strNextString = reader.nextString();
                if (strNextName != null) {
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3355) {
                        if (iHashCode != 3373707) {
                            if (iHashCode == 96619420 && strNextName.equals("email")) {
                                str2 = strNextString;
                            }
                        } else if (strNextName.equals("name")) {
                            str3 = strNextString;
                        }
                    } else if (strNextName.equals(PreferencesHelper.PREF_ID)) {
                        str = strNextString;
                    }
                }
            }
            s1 s1Var = new s1(str, str2, str3);
            reader.endObject();
            return s1Var;
        }
    }

    @JvmOverloads
    public s1() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(s1.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.User");
        }
        s1 s1Var = (s1) other;
        return Intrinsics.e(this.id, s1Var.id) && Intrinsics.e(this.email, s1Var.email) && Intrinsics.e(this.name, s1Var.name);
    }

    @JvmOverloads
    public s1(String str, String str2, String str3) {
        this.id = str;
        this.email = str2;
        this.name = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.d();
        writer.l(PreferencesHelper.PREF_ID).O(this.id);
        writer.l("email").O(this.email);
        writer.l("name").O(this.name);
        writer.i();
    }

    public /* synthetic */ s1(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
