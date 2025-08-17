package bt;

import Iv.AbstractC3761b;
import Iv.C;
import Qs.p;
import com.okta.authfoundation.client.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.C15331h;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbt/d;", "", "LIv/b;", "json", "Lkotlin/coroutines/CoroutineContext;", "computeDispatcher", "<init>", "(LIv/b;Lkotlin/coroutines/CoroutineContext;)V", "", "rawValue", "Lbt/b;", "a", "(Ljava/lang/String;)Lbt/b;", "LIv/b;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3761b json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext computeDispatcher;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbt/d$a;", "", "<init>", "()V", "Lbt/d;", "a", "()Lbt/d;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final d a() {
            return new d(j.INSTANCE.b(), p.f31384a.x());
        }
    }

    public d(AbstractC3761b json, CoroutineContext computeDispatcher) {
        Intrinsics.j(json, "json");
        Intrinsics.j(computeDispatcher, "computeDispatcher");
        this.json = json;
        this.computeDispatcher = computeDispatcher;
    }

    public final b a(String rawValue) {
        String strC0;
        String strC02;
        Intrinsics.j(rawValue, "rawValue");
        List listA1 = StringsKt.a1(rawValue, new String[]{"."}, false, 0, 6, null);
        if (listA1.size() != 3) {
            throw new IllegalArgumentException("Token doesn't contain 3 parts. Needs header, claims data, and signature.");
        }
        C15331h.Companion companion = C15331h.INSTANCE;
        C15331h c15331hA = companion.a((String) listA1.get(0));
        if (c15331hA == null || (strC0 = c15331hA.c0()) == null) {
            throw new IllegalArgumentException("Header isn't valid base64.");
        }
        AbstractC3761b abstractC3761b = this.json;
        abstractC3761b.getSerializersModule();
        c cVar = (c) abstractC3761b.b(c.INSTANCE.serializer(), strC0);
        C15331h c15331hA2 = companion.a((String) listA1.get(1));
        if (c15331hA2 == null || (strC02 = c15331hA2.c0()) == null) {
            throw new IllegalArgumentException("Claims aren't valid base64.");
        }
        AbstractC3761b abstractC3761b2 = this.json;
        abstractC3761b2.getSerializersModule();
        return new b(cVar.getAlg(), cVar.getKid(), new Rs.b((C) abstractC3761b2.b(C.INSTANCE.serializer(), strC02), this.json), (String) listA1.get(2), rawValue, this.computeDispatcher);
    }
}
