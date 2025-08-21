package D7;

import com.dynatrace.agent.storage.db.EventRecord;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LD7/b;", "LD7/a;", "", "dataVersion", "<init>", "(I)V", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "input", "", "c", "(Ljava/util/List;)Ljava/lang/String;", "a", "I", "b", "()I", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int dataVersion;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"LD7/b$a;", "", "<init>", "()V", "", "dataVersion", "a", "(I)I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "(I)Ljava/lang/StringBuilder;", "", "DATA_VERSION", "Ljava/lang/String;", "JSON_EVENTS", "JSON_ENDING", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: D7.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StringBuilder b(int dataVersion) {
            StringBuilder sb2 = new StringBuilder("{\"data_version\":");
            sb2.append(dataVersion);
            sb2.append(",\"data\":{\"events\":[");
            Intrinsics.i(sb2, "append(...)");
            return sb2;
        }

        public final int a(int dataVersion) {
            String string = b(dataVersion).toString();
            Intrinsics.i(string, "toString(...)");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.i(bytes, "getBytes(...)");
            int length = bytes.length;
            byte[] bytes2 = "]}}".getBytes(charset);
            Intrinsics.i(bytes2, "getBytes(...)");
            return length + bytes2.length;
        }
    }

    /* renamed from: b, reason: from getter */
    public int getDataVersion() {
        return this.dataVersion;
    }

    @Override // w7.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(List<EventRecord> input) {
        Intrinsics.j(input, "input");
        StringBuilder sbB = INSTANCE.b(getDataVersion());
        Iterator<T> it = input.iterator();
        while (it.hasNext()) {
            sbB.append(((EventRecord) it.next()).getEvent() + ',');
        }
        if (!input.isEmpty()) {
            Intrinsics.i(sbB.deleteCharAt(StringsKt.k0(sbB)), "deleteCharAt(...)");
        }
        sbB.append("]}}");
        String string = sbB.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public b(int i10) {
        this.dataVersion = i10;
    }
}
