package tv;

import com.google.android.gms.common.api.a;
import kotlin.C17339g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import sv.EnumC17050a;
import vv.C17631E;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lsv/a;", "onBufferOverflow", "Ltv/A;", "a", "(IILsv/a;)Ltv/A;", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Ltv/F;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ltv/f;", "e", "(Ltv/F;Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "Lvv/E;", "Lvv/E;", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tv.H, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17146H {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final C17631E f162125a = new C17631E("NO_VALUE");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static final <T> InterfaceC17139A<T> a(int i10, int i11, EnumC17050a enumC17050a) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || enumC17050a == EnumC17050a.f161240a) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = a.e.API_PRIORITY_OTHER;
            }
            return new C17145G(i10, i12, enumC17050a);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC17050a).toString());
    }

    public static /* synthetic */ InterfaceC17139A b(int i10, int i11, EnumC17050a enumC17050a, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC17050a = EnumC17050a.f161240a;
        }
        return a(i10, i11, enumC17050a);
    }

    public static final <T> InterfaceC17152f<T> e(InterfaceC17144F<? extends T> interfaceC17144F, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        return ((i10 == 0 || i10 == -3) && enumC17050a == EnumC17050a.f161240a) ? interfaceC17144F : new C17339g(interfaceC17144F, coroutineContext, i10, enumC17050a);
    }
}
