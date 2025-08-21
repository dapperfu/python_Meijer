package l6;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import w6.C17846b;
import w6.C17847c;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0006\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u00063\u0010\t\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {"T", "Lkotlin/Function1;", "Lw6/b;", "Lkotlin/ParameterName;", "name", "frameInfo", "l6/o$a", "b", "(Lkotlin/jvm/functions/Function1;)Ll6/o$a;", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class o {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0004\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l6/o$a", "Lw6/c;", "Lw6/b;", "frameInfo", "a", "(Lw6/b;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C17847c<Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C17846b<Object>, Object> f149474d;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super C17846b<Object>, Object> function1) {
            this.f149474d = function1;
        }

        @Override // w6.C17847c
        public Object a(C17846b<Object> frameInfo) {
            Intrinsics.j(frameInfo, "frameInfo");
            return this.f149474d.invoke(frameInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a b(Function1 function1) {
        return new a(function1);
    }
}
