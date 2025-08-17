package z6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz6/k;", "", "", "statusCode", "", "Lz6/f;", "headers", "Lkw/g;", "bodySource", "Lkw/h;", "bodyString", "<init>", "(ILjava/util/List;Lkw/g;Lkw/h;)V", "a", "I", "c", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lkw/g;", "d", "Lkw/h;", "()Lkw/g;", "body", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g bodySource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15331h bodyString;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lz6/k$a;", "", "", "statusCode", "<init>", "(I)V", "Lkw/g;", "bodySource", "b", "(Lkw/g;)Lz6/k$a;", "", "Lz6/f;", "headers", "a", "(Ljava/util/List;)Lz6/k$a;", "Lz6/k;", "c", "()Lz6/k;", "I", "getStatusCode", "()I", "Lkw/g;", "Lkw/h;", "Lkw/h;", "bodyString", "", "d", "Ljava/util/List;", "", "()Z", "hasBody", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int statusCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15330g bodySource;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private C15331h bodyString;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers = new ArrayList();

        private final boolean d() {
            return (this.bodySource == null && this.bodyString == null) ? false : true;
        }

        public final a a(List<HttpHeader> headers) {
            Intrinsics.j(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final a b(InterfaceC15330g bodySource) {
            Intrinsics.j(bodySource, "bodySource");
            if (d()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.bodySource = bodySource;
            return this;
        }

        public final k c() {
            return new k(this.statusCode, this.headers, this.bodySource, this.bodyString, null);
        }

        public a(int i10) {
            this.statusCode = i10;
        }
    }

    public /* synthetic */ k(int i10, List list, InterfaceC15330g interfaceC15330g, C15331h c15331h, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, interfaceC15330g, c15331h);
    }

    private k(int i10, List<HttpHeader> list, InterfaceC15330g interfaceC15330g, C15331h c15331h) {
        this.statusCode = i10;
        this.headers = list;
        this.bodySource = interfaceC15330g;
        this.bodyString = c15331h;
    }

    public final InterfaceC15330g a() {
        InterfaceC15330g interfaceC15330g = this.bodySource;
        if (interfaceC15330g != null) {
            return interfaceC15330g;
        }
        C15331h c15331h = this.bodyString;
        if (c15331h != null) {
            return new C15328e().Z2(c15331h);
        }
        return null;
    }

    public final List<HttpHeader> b() {
        return this.headers;
    }

    /* renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }
}
