package L0;

import L0.h;
import Z.W;
import Z.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR2\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"LL0/i;", "LL0/h;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "value", "a", "(Ljava/lang/Object;)Z", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "LL0/h$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LL0/h$a;", "e", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "LZ/W;", "LZ/W;", "", "c", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Boolean> canBeSaved;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W<String, List<Object>> restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private W<String, List<Function0<Object>>> valueProviders;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L0/i$a", "LL0/h$a;", "", "unregister", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W<String, List<Function0<Object>>> f17761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Object> f17763c;

        a(W<String, List<Function0<Object>>> w10, String str, Function0<? extends Object> function0) {
            this.f17761a = w10;
            this.f17762b = str;
            this.f17763c = function0;
        }

        @Override // L0.h.a
        public void unregister() {
            List<Function0<Object>> listU = this.f17761a.u(this.f17762b);
            if (listU != null) {
                listU.remove(this.f17763c);
            }
            List<Function0<Object>> list = listU;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f17761a.x(this.f17762b, listU);
        }
    }

    @Override // L0.h
    public boolean a(Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // L0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> e() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.i.e():java.util.Map");
    }

    @Override // L0.h
    public Object f(String key) {
        W<String, List<Object>> w10;
        W<String, List<Object>> w11 = this.restored;
        List<Object> listU = w11 != null ? w11.u(key) : null;
        List<Object> list = listU;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listU.size() > 1 && (w10 = this.restored) != null) {
            w10.r(key, listU.subList(1, listU.size()));
        }
        return listU.get(0);
    }

    public i(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        W<String, List<Object>> wF;
        this.canBeSaved = function1;
        if (map != null && !map.isEmpty()) {
            wF = j.f(map);
        } else {
            wF = null;
        }
        this.restored = wF;
    }

    @Override // L0.h
    public h.a b(String key, Function0<? extends Object> valueProvider) {
        if (!j.d(key)) {
            W<String, List<Function0<Object>>> wC = this.valueProviders;
            if (wC == null) {
                wC = i0.c();
                this.valueProviders = wC;
            }
            List<Function0<Object>> listE = wC.e(key);
            if (listE == null) {
                listE = new ArrayList<>();
                wC.x(key, listE);
            }
            listE.add(valueProvider);
            return new a(wC, key, valueProvider);
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
