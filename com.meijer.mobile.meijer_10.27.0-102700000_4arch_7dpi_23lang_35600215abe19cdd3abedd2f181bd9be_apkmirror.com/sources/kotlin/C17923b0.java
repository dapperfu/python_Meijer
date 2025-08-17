package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lx0/b0;", "T", "", "<init>", "()V", "", "position", "", "a", "(Ljava/lang/Object;F)V", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "anchors", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17923b0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final Map<T, Float> b() {
        return this.anchors;
    }

    public final void a(T t10, float f10) {
        this.anchors.put(t10, Float.valueOf(f10));
    }
}
