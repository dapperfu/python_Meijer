package a1;

import a1.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"La1/f;", "", "<init>", "()V", "a", "()La1/f;", "", "x", "y", "f", "(FF)La1/f;", "d", "dx", "dy", "e", "c", "(F)La1/f;", "g", "Ljava/util/ArrayList;", "La1/h;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", "b", "()Ljava/util/List;", "nodes", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<h> _nodes = new ArrayList<>(32);

    public final f a() {
        this._nodes.add(h.b.f44257c);
        return this;
    }

    public final List<h> b() {
        return this._nodes;
    }

    public final f c(float x10) {
        this._nodes.add(new h.HorizontalTo(x10));
        return this;
    }

    public final f d(float x10, float y10) {
        this._nodes.add(new h.LineTo(x10, y10));
        return this;
    }

    public final f e(float dx, float dy) {
        this._nodes.add(new h.RelativeLineTo(dx, dy));
        return this;
    }

    public final f f(float x10, float y10) {
        this._nodes.add(new h.MoveTo(x10, y10));
        return this;
    }

    public final f g(float dy) {
        this._nodes.add(new h.RelativeVerticalTo(dy));
        return this;
    }
}
