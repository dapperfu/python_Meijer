package Jv;

import Iv.AbstractC3761b;
import Iv.C3762c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"LJv/I;", "LJv/c;", "LIv/b;", "json", "LIv/c;", "value", "<init>", "(LIv/b;LIv/c;)V", "LFv/f;", "descriptor", "", "index", "", "d0", "(LFv/f;I)Ljava/lang/String;", "tag", "LIv/i;", "j0", "(Ljava/lang/String;)LIv/i;", "v", "(LFv/f;)I", "g", "LIv/c;", "z0", "()LIv/c;", "h", "I", "size", "i", "currentIndex", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class I extends AbstractC3920c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C3762c value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC3761b json, C3762c value) {
        super(json, value, null, 4, null);
        Intrinsics.j(json, "json");
        Intrinsics.j(value, "value");
        this.value = value;
        this.size = w0().size();
        this.currentIndex = -1;
    }

    @Override // Hv.O
    protected String d0(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return String.valueOf(index);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jv.AbstractC3920c
    public Iv.i j0(String tag) {
        Intrinsics.j(tag, "tag");
        return w0().get(Integer.parseInt(tag));
    }

    @Override // Gv.c
    public int v(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        int i10 = this.currentIndex;
        if (i10 >= this.size - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    @Override // Jv.AbstractC3920c
    /* renamed from: z0, reason: from getter and merged with bridge method [inline-methods] */
    public C3762c w0() {
        return this.value;
    }
}
