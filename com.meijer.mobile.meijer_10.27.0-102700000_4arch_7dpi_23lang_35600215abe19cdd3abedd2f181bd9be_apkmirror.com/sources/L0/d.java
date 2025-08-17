package L0;

import L0.h;
import androidx.compose.runtime.N0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'¨\u0006)"}, d2 = {"LL0/d;", "T", "LL0/m;", "Landroidx/compose/runtime/N0;", "LL0/k;", "", "saver", "LL0/h;", "registry", "", "key", "value", "", "inputs", "<init>", "(LL0/k;LL0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "", "h", "()V", "i", "", "a", "(Ljava/lang/Object;)Z", "b", "f", "e", "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "LL0/k;", "LL0/h;", "c", "Ljava/lang/String;", "d", "Ljava/lang/Object;", "[Ljava/lang/Object;", "LL0/h$a;", "LL0/h$a;", "entry", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class d<T> implements m, N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k<T, Object> saver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private h registry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String key;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] inputs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private h.a entry;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Object> valueProvider = new a(this);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class a extends Lambda implements Function0<Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d<T> f17594f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<T> dVar) {
            super(0);
            this.f17594f = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            k kVar = ((d) this.f17594f).saver;
            d<T> dVar = this.f17594f;
            Object obj = ((d) dVar).value;
            if (obj != null) {
                return kVar.a(dVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    private final void h() {
        h hVar = this.registry;
        if (this.entry == null) {
            if (hVar != null) {
                c.d(hVar, this.valueProvider.invoke());
                this.entry = hVar.b(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // L0.m
    public boolean a(Object value) {
        h hVar = this.registry;
        return hVar == null || hVar.a(value);
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        h.a aVar = this.entry;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        h.a aVar = this.entry;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    public final T g(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    public final void i(k<T, Object> saver, h registry, String key, T value, Object[] inputs) {
        boolean z10;
        boolean z11 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z10 = true;
        } else {
            z10 = false;
        }
        if (Intrinsics.e(this.key, key)) {
            z11 = z10;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        h.a aVar = this.entry;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.unregister();
        }
        this.entry = null;
        h();
    }

    public d(k<T, Object> kVar, h hVar, String str, T t10, Object[] objArr) {
        this.saver = kVar;
        this.registry = hVar;
        this.key = str;
        this.value = t10;
        this.inputs = objArr;
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        h();
    }
}
