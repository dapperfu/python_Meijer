package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C6624v0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/S;", "Lcom/bugsnag/android/v0$a;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;)V", "Lcom/bugsnag/android/v0;", "stream", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class S implements C6624v0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/S$a;", "", "Lcom/bugsnag/android/S;", "<init>", "()V", "Landroid/util/JsonReader;", "reader", "a", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/S;", "", "KEY_ID", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.S$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public S a(JsonReader reader) throws IOException {
            String strNextString;
            reader.beginObject();
            if (reader.hasNext() && Intrinsics.e(PreferencesHelper.PREF_ID, reader.nextName())) {
                strNextString = reader.nextString();
            } else {
                strNextString = null;
            }
            return new S(strNextString);
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public S(String str) {
        this.id = str;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 stream) throws IOException {
        stream.d();
        stream.l(PreferencesHelper.PREF_ID);
        stream.O(getId());
        stream.i();
    }
}
