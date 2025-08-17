package Lv;

import Jv.AbstractC3939w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"LLv/a;", "LJv/w;", "Lkw/g;", "source", "<init>", "(Lkw/g;)V", "", "b", "()Z", "", "c", "()I", "Lkw/g;", "kotlinx-serialization-json-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC3939w {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    public a(InterfaceC15330g source) {
        Intrinsics.j(source, "source");
        this.source = source;
    }

    @Override // Jv.AbstractC3939w
    public boolean b() {
        return this.source.j2();
    }

    @Override // Jv.AbstractC3939w
    public int c() {
        return this.source.L2();
    }
}
