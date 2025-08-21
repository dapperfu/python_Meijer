package T6;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bugsnag.android.D0;
import com.bugsnag.android.NativeInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LT6/b;", "", "Lcom/bugsnag/android/D0;", "logger", "", "", "enabledReleaseStages", "<init>", "(Lcom/bugsnag/android/D0;Ljava/util/Collection;)V", "Landroid/util/JsonReader;", "json", "", "d", "(Landroid/util/JsonReader;)Z", "e", "c", "Ljava/io/File;", "report", "a", "(Ljava/io/File;)Z", "b", "Lcom/bugsnag/android/D0;", "Ljava/util/Collection;", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Collection<String> enabledReleaseStages;

    public b(D0 d02, Collection<String> collection) {
        this.logger = d02;
        this.enabledReleaseStages = collection;
    }

    private final boolean d(JsonReader json) throws IOException {
        if (this.enabledReleaseStages.isEmpty()) {
            json.skipValue();
            return false;
        }
        json.beginObject();
        while (json.peek() != JsonToken.END_OBJECT) {
            if (Intrinsics.e(json.nextName(), "releaseStage")) {
                if (!this.enabledReleaseStages.contains(json.nextString())) {
                    return true;
                }
            } else {
                json.skipValue();
            }
        }
        json.endObject();
        return false;
    }

    private final boolean c(JsonReader json) throws IOException {
        json.beginObject();
        while (json.peek() != JsonToken.END_OBJECT) {
            if (Intrinsics.e(json.nextName(), "errorClass")) {
                if (NativeInterface.isDiscardErrorClass(json.nextString())) {
                    return true;
                }
            } else {
                json.skipValue();
            }
        }
        json.endObject();
        return false;
    }

    private final boolean e(JsonReader json) throws IOException {
        json.beginArray();
        while (json.peek() != JsonToken.END_ARRAY) {
            if (c(json)) {
                this.logger.d("Discarding native report due to errorClass");
                return true;
            }
        }
        json.endArray();
        return false;
    }

    public final boolean a(File report) {
        if (StringsKt.G(report.getName(), ".json", false, 2, null) && !StringsKt.G(report.getName(), ".static_data.json", false, 2, null)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(report), Charsets.UTF_8), 8192);
                try {
                    JsonReader jsonReader = new JsonReader(bufferedReader);
                    try {
                        boolean zB = b(jsonReader);
                        CloseableKt.a(jsonReader, null);
                        CloseableKt.a(bufferedReader, null);
                        return zB;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception unused) {
                return false;
            }
        } else {
            return true;
        }
    }

    public final boolean b(JsonReader json) throws IOException {
        boolean zE;
        json.beginObject();
        boolean z10 = true;
        boolean z11 = true;
        do {
            zE = false;
            if (!json.hasNext() || (!z10 && !z11)) {
                return false;
            }
            String strNextName = json.nextName();
            if (Intrinsics.e(strNextName, "app")) {
                zE = d(json);
                z10 = false;
            } else if (Intrinsics.e(strNextName, "exceptions")) {
                zE = e(json);
                z11 = false;
            } else {
                json.skipValue();
            }
        } while (!zE);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(D0 d02, Collection collection, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0 && (collection = NativeInterface.getEnabledReleaseStages()) == null) {
            collection = SetsKt.e();
        }
        this(d02, collection);
    }
}
