package androidx.compose.ui.platform;

import L0.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/x0;", "LL0/h;", "saveableStateRegistry", "Lkotlin/Function0;", "", "onDispose", "<init>", "(LL0/h;Lkotlin/jvm/functions/Function0;)V", "", "value", "", "a", "(Ljava/lang/Object;)Z", "", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "e", "()Ljava/util/Map;", "valueProvider", "LL0/h$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LL0/h$a;", "c", "()V", "Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5904x0 implements L0.h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onDispose;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ L0.h f52281b;

    @Override // L0.h
    public boolean a(Object value) {
        return this.f52281b.a(value);
    }

    @Override // L0.h
    public Map<String, List<Object>> e() {
        return this.f52281b.e();
    }

    @Override // L0.h
    public Object f(String key) {
        return this.f52281b.f(key);
    }

    @Override // L0.h
    public h.a b(String key, Function0<? extends Object> valueProvider) {
        return this.f52281b.b(key, valueProvider);
    }

    public final void c() {
        this.onDispose.invoke();
    }

    public C5904x0(L0.h hVar, Function0<Unit> function0) {
        this.onDispose = function0;
        this.f52281b = hVar;
    }
}
