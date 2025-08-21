package Sv;

import gw.InterfaceC14418g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LSv/h;", "Lokhttp3/ResponseBody;", "", "contentTypeString", "", "contentLength", "Lgw/g;", "source", "<init>", "(Ljava/lang/String;JLgw/g;)V", "()J", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "()Lgw/g;", "a", "Ljava/lang/String;", "b", "J", "c", "Lgw/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends ResponseBody {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String contentTypeString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    public h(String str, long j10, InterfaceC14418g source) {
        Intrinsics.j(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public okhttp3.j getF154457a() {
        String str = this.contentTypeString;
        if (str != null) {
            return okhttp3.j.INSTANCE.b(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source, reason: from getter */
    public InterfaceC14418g getSource() {
        return this.source;
    }
}
