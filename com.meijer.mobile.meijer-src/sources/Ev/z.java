package Ev;

import com.google.maps.android.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"LEv/z;", "LEv/E;", "<init>", "()V", "Lzv/b;", "serializer", "()Lzv/b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z extends E {
    public static final z INSTANCE = new z();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final String content = BuildConfig.TRAVIS;

    private z() {
        super(null);
    }

    @Override // Ev.E
    /* renamed from: a */
    public String getContent() {
        return content;
    }

    public final zv.b<z> serializer() {
        return A.f8584a;
    }
}
