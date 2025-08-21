package r5;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lr5/v;", "", "<init>", "()V", "", "a", "()J", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "provider", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: r5.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16858v {

    /* renamed from: a, reason: collision with root package name */
    public static final C16858v f159262a = new C16858v();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Function0<Long> provider = a.f159264b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: r5.v$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f159264b = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final long a() {
        return provider.invoke().longValue();
    }

    private C16858v() {
    }
}
