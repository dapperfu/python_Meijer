package k5;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import java.util.Map;
import java.util.Set;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import r5.C16837a;

@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003*\u0001\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010%¨\u0006'"}, d2 = {"Lk5/f;", "Lk5/h;", "", "maxSize", "Lk5/i;", "weakMemoryCache", "<init>", "(ILk5/i;)V", "Lk5/c$b;", "key", "Lk5/c$c;", "c", "(Lk5/c$b;)Lk5/c$c;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "d", "(Lk5/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "f", "()V", "level", "a", "(I)V", "Lk5/i;", "k5/f$b", "b", "Lk5/f$b;", "cache", "h", "()I", "size", "g", "", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15092f implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i weakMemoryCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b cache;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk5/f$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "", "size", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "I", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: k5.f$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap bitmap;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> extras;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int size;

        /* renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Map<String, Object> b() {
            return this.extras;
        }

        /* renamed from: c, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.bitmap = bitmap;
            this.extras = map;
            this.size = i10;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"k5/f$b", "Landroidx/collection/LruCache;", "Lk5/c$b;", "Lk5/f$a;", "key", "value", "", "m", "(Lk5/c$b;Lk5/f$a;)I", "", "evicted", "oldValue", "newValue", "", "l", "(ZLk5/c$b;Lk5/f$a;Lk5/f$a;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: k5.f$b */
    public static final class b extends LruCache<InterfaceC15089c.Key, a> {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15092f f141613j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, C15092f c15092f) {
            super(i10);
            this.f141613j = c15092f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(boolean evicted, InterfaceC15089c.Key key, a oldValue, a newValue) {
            this.f141613j.weakMemoryCache.d(key, oldValue.getBitmap(), oldValue.b(), oldValue.getSize());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int j(InterfaceC15089c.Key key, a value) {
            return value.getSize();
        }
    }

    @Override // k5.h
    public void a(int level) {
        if (level >= 40) {
            f();
        } else {
            if (10 > level || level >= 20) {
                return;
            }
            this.cache.k(h() / 2);
        }
    }

    @Override // k5.h
    public Set<InterfaceC15089c.Key> b() {
        return this.cache.snapshot().keySet();
    }

    @Override // k5.h
    public InterfaceC15089c.Value c(InterfaceC15089c.Key key) {
        a aVarD = this.cache.d(key);
        if (aVarD != null) {
            return new InterfaceC15089c.Value(aVarD.getBitmap(), aVarD.b());
        }
        return null;
    }

    public void f() {
        this.cache.c();
    }

    public int g() {
        return this.cache.e();
    }

    public int h() {
        return this.cache.i();
    }

    public C15092f(int i10, i iVar) {
        this.weakMemoryCache = iVar;
        this.cache = new b(i10, this);
    }

    @Override // k5.h
    public void d(InterfaceC15089c.Key key, Bitmap bitmap, Map<String, ? extends Object> extras) {
        int iA = C16837a.a(bitmap);
        if (iA <= g()) {
            this.cache.f(key, new a(bitmap, extras, iA));
        } else {
            this.cache.g(key);
            this.weakMemoryCache.d(key, bitmap, extras, iA);
        }
    }
}
