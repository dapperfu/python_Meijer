package kotlin;

import kotlin.AbstractC15753m.a;
import kotlin.InterfaceC15745e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ln0/m;", "Ln0/m$a;", "Interval", "", "<init>", "()V", "", "index", "m", "(I)Ljava/lang/Object;", "j", "Ln0/e;", "k", "()Ln0/e;", "intervals", "l", "()I", "itemCount", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15753m<Interval extends a> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R1\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ln0/m$a;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "getType", "type", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.m$a */
    public interface a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln0/m$a;", "Interval", "", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n0.m$a$a, reason: collision with other inner class name */
        static final class C2327a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final C2327a f150916f = new C2327a();

            C2327a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return C2327a.f150916f;
        }
    }

    public abstract InterfaceC15745e<Interval> k();

    public final Object j(int index) {
        InterfaceC15745e.a<Interval> aVar = k().get(index);
        return aVar.c().getType().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    public final int l() {
        return k().getSize();
    }

    public final Object m(int index) {
        Object objInvoke;
        InterfaceC15745e.a<Interval> aVar = k().get(index);
        int startIndex = index - aVar.getStartIndex();
        Function1<Integer, Object> key = aVar.c().getKey();
        if (key != null && (objInvoke = key.invoke(Integer.valueOf(startIndex))) != null) {
            return objInvoke;
        }
        return C15729O.a(index);
    }
}
