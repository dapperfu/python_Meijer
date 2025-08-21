package A6;

import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14417f;
import gw.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z6.F;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LA6/m;", "LA6/e;", "", "", "Lz6/F;", "uploads", "Lgw/h;", "operationByteString", "<init>", "(Ljava/util/Map;Lgw/h;)V", "c", "(Ljava/util/Map;)Lgw/h;", "Lgw/f;", "", "writeUploadContents", "", "e", "(Lgw/f;Z)V", "bufferedSink", "a", "(Lgw/f;)V", "Ljava/util/Map;", "b", "Lgw/h;", "Ljava/lang/String;", "boundary", "d", "getContentType", "()Ljava/lang/String;", "contentType", "", "Lkotlin/Lazy;", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, F> uploads;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14419h operationByteString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentLength;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Map<String, ? extends F> uploads, C14419h operationByteString) {
        Intrinsics.j(uploads, "uploads");
        Intrinsics.j(operationByteString, "operationByteString");
        this.uploads = uploads;
        this.operationByteString = operationByteString;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        Intrinsics.i(string, "toString(...)");
        this.boundary = string;
        this.contentType = "multipart/form-data; boundary=" + string;
        this.contentLength = LazyKt.b(new Function0() { // from class: A6.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(m.d(this.f172a));
            }
        });
    }

    private final C14419h c(Map<String, ? extends F> uploads) throws IOException {
        C14416e c14416e = new C14416e();
        D6.c cVar = new D6.c(c14416e, null);
        Set<Map.Entry<String, ? extends F>> setEntrySet = uploads.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        int i10 = 0;
        for (Object obj : setEntrySet) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            arrayList.add(TuplesKt.a(String.valueOf(i10), CollectionsKt.e(((Map.Entry) obj).getKey())));
            i10 = i11;
        }
        D6.b.a(cVar, MapsKt.y(arrayList));
        return c14416e.P2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(m mVar) throws IOException {
        a aVar = new a(w.a());
        InterfaceC14417f interfaceC14417fB = w.b(aVar);
        mVar.e(interfaceC14417fB, false);
        interfaceC14417fB.flush();
        long bytesWritten = aVar.getBytesWritten();
        Iterator<T> it = mVar.uploads.values().iterator();
        long contentLength = 0;
        while (it.hasNext()) {
            contentLength += ((F) it.next()).getContentLength();
        }
        return bytesWritten + contentLength;
    }

    private final void e(InterfaceC14417f interfaceC14417f, boolean z10) throws IOException {
        interfaceC14417f.G0("--" + this.boundary + "\r\n");
        interfaceC14417f.G0("Content-Disposition: form-data; name=\"operations\"\r\n");
        interfaceC14417f.G0("Content-Type: application/json\r\n");
        interfaceC14417f.G0("Content-Length: " + this.operationByteString.V() + "\r\n");
        interfaceC14417f.G0("\r\n");
        interfaceC14417f.g1(this.operationByteString);
        C14419h c14419hC = c(this.uploads);
        interfaceC14417f.G0("\r\n--" + this.boundary + "\r\n");
        interfaceC14417f.G0("Content-Disposition: form-data; name=\"map\"\r\n");
        interfaceC14417f.G0("Content-Type: application/json\r\n");
        interfaceC14417f.G0("Content-Length: " + c14419hC.V() + "\r\n");
        interfaceC14417f.G0("\r\n");
        interfaceC14417f.g1(c14419hC);
        int i10 = 0;
        for (Object obj : this.uploads.values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            F f10 = (F) obj;
            interfaceC14417f.G0("\r\n--" + this.boundary + "\r\n");
            interfaceC14417f.G0("Content-Disposition: form-data; name=\"" + i10 + '\"');
            if (f10.getFileName() != null) {
                interfaceC14417f.G0("; filename=\"" + f10.getFileName() + '\"');
            }
            interfaceC14417f.G0("\r\n");
            interfaceC14417f.G0("Content-Type: " + f10.getContentType() + "\r\n");
            long contentLength = f10.getContentLength();
            if (contentLength != -1) {
                interfaceC14417f.G0("Content-Length: " + contentLength + "\r\n");
            }
            interfaceC14417f.G0("\r\n");
            if (z10) {
                f10.a(interfaceC14417f);
            }
            i10 = i11;
        }
        interfaceC14417f.G0("\r\n--" + this.boundary + "--\r\n");
    }

    @Override // A6.e
    public void a(InterfaceC14417f bufferedSink) throws IOException {
        Intrinsics.j(bufferedSink, "bufferedSink");
        e(bufferedSink, true);
    }

    @Override // A6.e
    public long getContentLength() {
        return ((Number) this.contentLength.getValue()).longValue();
    }

    @Override // A6.e
    public String getContentType() {
        return this.contentType;
    }
}
