package okhttp3;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kw.C15328e;
import kw.InterfaceC15329f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\r\u0018B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/h;", "Lokhttp3/RequestBody;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lkw/f;", "sink", "", "countBytes", "", "a", "(Lkw/f;Z)J", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "contentLength", "()J", "", "writeTo", "(Lkw/f;)V", "Ljava/util/List;", "b", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends RequestBody {

    /* renamed from: d, reason: collision with root package name */
    private static final j f154360d = j.INSTANCE.a("application/x-www-form-urlencoded");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedNames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedValues;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/h$a;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/h$a;", "b", "Lokhttp3/h;", "c", "()Lokhttp3/h;", "Ljava/nio/charset/Charset;", "", "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> names;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> values;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @JvmOverloads
        public a(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public final a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.names.add(gw.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.charset, 91, null));
            this.values.add(gw.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.charset, 91, null));
            return this;
        }

        public final a b(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.names.add(gw.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.charset, 83, null));
            this.values.add(gw.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final h c() {
            return new h(this.names, this.values);
        }

        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return a(null, true);
    }

    public h(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.j(encodedNames, "encodedNames");
        Intrinsics.j(encodedValues, "encodedValues");
        this.encodedNames = Rv.k.x(encodedNames);
        this.encodedValues = Rv.k.x(encodedValues);
    }

    private final long a(InterfaceC15329f sink, boolean countBytes) throws EOFException {
        C15328e bufferField;
        if (countBytes) {
            bufferField = new C15328e();
        } else {
            Intrinsics.g(sink);
            bufferField = sink.getBufferField();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                bufferField.writeByte(38);
            }
            bufferField.I0(this.encodedNames.get(i10));
            bufferField.writeByte(61);
            bufferField.I0(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = bufferField.getSize();
        bufferField.a();
        return size2;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public j getContentType() {
        return f154360d;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC15329f sink) throws IOException {
        Intrinsics.j(sink, "sink");
        a(sink, false);
    }
}
