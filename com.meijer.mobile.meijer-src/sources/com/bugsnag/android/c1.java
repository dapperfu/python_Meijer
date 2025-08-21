package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BW\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B\u001f\b\u0010\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R2\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0013R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R$\u0010<\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b\u0019\u00109\"\u0004\b:\u0010;R$\u0010?\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b\"\u00109\"\u0004\b>\u0010;R$\u0010B\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\b\u001f\u00109\"\u0004\bA\u0010;R$\u0010F\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR$\u0010H\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010)\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R$\u0010O\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\b(\u0010M\"\u0004\b.\u0010N¨\u0006P"}, d2 = {"Lcom/bugsnag/android/c1;", "Lcom/bugsnag/android/v0$a;", "", "method", "file", "", "lineNumber", "", "inProject", "", "code", "columnNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Number;)V", "Lcom/bugsnag/android/NativeStackframe;", "nativeFrame", "(Lcom/bugsnag/android/NativeStackframe;)V", "", "json", "(Ljava/util/Map;)V", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "a", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "b", "getFile", "setFile", "c", "Ljava/lang/Number;", "getLineNumber", "()Ljava/lang/Number;", "setLineNumber", "(Ljava/lang/Number;)V", "d", "Ljava/lang/Boolean;", "getInProject", "()Ljava/lang/Boolean;", "setInProject", "(Ljava/lang/Boolean;)V", "e", "Ljava/util/Map;", "getCode", "()Ljava/util/Map;", "setCode", "f", "getColumnNumber", "setColumnNumber", "", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setFrameAddress", "(Ljava/lang/Long;)V", "frameAddress", "h", "setSymbolAddress", "symbolAddress", "i", "setLoadAddress", "loadAddress", "j", "getCodeIdentifier", "setCodeIdentifier", "codeIdentifier", "k", "isPC", "setPC", "Lcom/bugsnag/android/ErrorType;", "l", "Lcom/bugsnag/android/ErrorType;", "()Lcom/bugsnag/android/ErrorType;", "(Lcom/bugsnag/android/ErrorType;)V", "type", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c1 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String method;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String file;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Number lineNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Boolean inProject;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> code;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Number columnNumber;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Long frameAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Long symbolAddress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Long loadAddress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String codeIdentifier;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean isPC;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ErrorType type;

    public /* synthetic */ c1(String str, String str2, Number number, Boolean bool, Map map, Number number2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, bool, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? null : number2);
    }

    @JvmOverloads
    public c1(String str, String str2, Number number, Boolean bool, Map<String, String> map, Number number2) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.inProject = bool;
        this.code = map;
        this.columnNumber = number2;
    }

    /* renamed from: a, reason: from getter */
    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    /* renamed from: b, reason: from getter */
    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    /* renamed from: c, reason: from getter */
    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    /* renamed from: d, reason: from getter */
    public final ErrorType getType() {
        return this.type;
    }

    public final void e(ErrorType errorType) {
        this.type = errorType;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.d();
        writer.l("method").O(this.method);
        writer.l("file").O(this.file);
        writer.l("lineNumber").K(this.lineNumber);
        Boolean bool = this.inProject;
        if (bool != null) {
            writer.l("inProject").R(bool.booleanValue());
        }
        writer.l("columnNumber").K(this.columnNumber);
        if (this.frameAddress != null) {
            writer.l("frameAddress").O(R6.q.f32021a.h(getFrameAddress()));
        }
        if (this.symbolAddress != null) {
            writer.l("symbolAddress").O(R6.q.f32021a.h(getSymbolAddress()));
        }
        if (this.loadAddress != null) {
            writer.l("loadAddress").O(R6.q.f32021a.h(getLoadAddress()));
        }
        String str = this.codeIdentifier;
        if (str != null) {
            writer.l("codeIdentifier").O(str);
        }
        Boolean bool2 = this.isPC;
        if (bool2 != null) {
            writer.l("isPC").R(bool2.booleanValue());
        }
        ErrorType errorType = this.type;
        if (errorType != null) {
            writer.l("type").O(errorType.getDesc());
        }
        Map<String, String> map = this.code;
        if (map != null) {
            writer.l("code");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.d();
                writer.l(entry.getKey());
                writer.O(entry.getValue());
                writer.i();
            }
        }
        writer.i();
    }

    public c1(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), null, null, null, 32, null);
        this.frameAddress = nativeStackframe.getFrameAddress();
        this.symbolAddress = nativeStackframe.getSymbolAddress();
        this.loadAddress = nativeStackframe.getLoadAddress();
        this.codeIdentifier = nativeStackframe.getCodeIdentifier();
        this.isPC = nativeStackframe.getIsPC();
        this.type = nativeStackframe.getType();
    }

    public c1(Map<String, ? extends Object> map) {
        Object obj = map.get("method");
        this.method = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("file");
        this.file = obj2 instanceof String ? (String) obj2 : null;
        R6.q qVar = R6.q.f32021a;
        this.lineNumber = qVar.e(map.get("lineNumber"));
        Object obj3 = map.get("inProject");
        this.inProject = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("columnNumber");
        this.columnNumber = obj4 instanceof Number ? (Number) obj4 : null;
        this.frameAddress = qVar.e(map.get("frameAddress"));
        this.symbolAddress = qVar.e(map.get("symbolAddress"));
        this.loadAddress = qVar.e(map.get("loadAddress"));
        Object obj5 = map.get("codeIdentifier");
        this.codeIdentifier = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("isPC");
        this.isPC = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        Object obj7 = map.get("code");
        this.code = obj7 instanceof Map ? (Map) obj7 : null;
        Object obj8 = map.get("type");
        String str = obj8 instanceof String ? (String) obj8 : null;
        this.type = str != null ? ErrorType.INSTANCE.a(str) : null;
    }
}
