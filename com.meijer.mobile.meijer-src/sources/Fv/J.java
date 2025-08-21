package Fv;

import Ev.AbstractC3260b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, d2 = {"LFv/J;", "LFv/H;", "LEv/b;", "json", "LEv/C;", "value", "<init>", "(LEv/b;LEv/C;)V", "LBv/f;", "descriptor", "", "index", "", "d0", "(LBv/f;I)Ljava/lang/String;", "f", "(LBv/f;)I", "tag", "LEv/i;", "j0", "(Ljava/lang/String;)LEv/i;", "", "a", "(LBv/f;)V", "k", "LEv/C;", "B0", "()LEv/C;", "", "l", "Ljava/util/List;", "keys", "m", "I", "size", "n", "position", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
final class J extends H {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ev.C value;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<String> keys;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int position;

    @Override // Fv.H, Fv.AbstractC3593c, Cv.c
    public void a(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC3260b json, Ev.C value) {
        super(json, value, null, null, 12, null);
        Intrinsics.j(json, "json");
        Intrinsics.j(value, "value");
        this.value = value;
        List<String> listJ1 = CollectionsKt.j1(w0().keySet());
        this.keys = listJ1;
        this.size = listJ1.size() * 2;
        this.position = -1;
    }

    @Override // Fv.H, Fv.AbstractC3593c
    /* renamed from: B0, reason: from getter and merged with bridge method [inline-methods] */
    public Ev.C getValue() {
        return this.value;
    }

    @Override // Fv.H, Dv.O
    protected String d0(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return this.keys.get(index / 2);
    }

    @Override // Fv.H, Cv.c
    public int f(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        int i10 = this.position;
        if (i10 >= this.size - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.position = i11;
        return i11;
    }

    @Override // Fv.H, Fv.AbstractC3593c
    protected Ev.i j0(String tag) {
        Intrinsics.j(tag, "tag");
        return this.position % 2 == 0 ? Ev.j.a(tag) : (Ev.i) MapsKt.l(w0(), tag);
    }
}
