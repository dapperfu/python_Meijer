package k5;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import r5.C16837a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lk5/a;", "Lk5/h;", "Lk5/i;", "weakMemoryCache", "<init>", "(Lk5/i;)V", "Lk5/c$b;", "key", "Lk5/c$c;", "c", "(Lk5/c$b;)Lk5/c$c;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "d", "(Lk5/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "", "level", "a", "(I)V", "Lk5/i;", "", "b", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15087a implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i weakMemoryCache;

    @Override // k5.h
    public void a(int level) {
    }

    @Override // k5.h
    public InterfaceC15089c.Value c(InterfaceC15089c.Key key) {
        return null;
    }

    @Override // k5.h
    public void d(InterfaceC15089c.Key key, Bitmap bitmap, Map<String, ? extends Object> extras) {
        this.weakMemoryCache.d(key, bitmap, extras, C16837a.a(bitmap));
    }

    public C15087a(i iVar) {
        this.weakMemoryCache = iVar;
    }

    @Override // k5.h
    public Set<InterfaceC15089c.Key> b() {
        return SetsKt.e();
    }
}
