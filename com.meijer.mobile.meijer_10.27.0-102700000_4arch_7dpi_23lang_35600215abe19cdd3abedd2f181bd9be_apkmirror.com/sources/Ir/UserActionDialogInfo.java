package Ir;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"LIr/a;", "T", "", "", "title", "body", "positiveButtonText", "negativeButtonText", "data", "<init>", "(IIIILjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ir.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class UserActionDialogInfo<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int positiveButtonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int negativeButtonText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final T data;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActionDialogInfo)) {
            return false;
        }
        UserActionDialogInfo userActionDialogInfo = (UserActionDialogInfo) other;
        return this.title == userActionDialogInfo.title && this.body == userActionDialogInfo.body && this.positiveButtonText == userActionDialogInfo.positiveButtonText && this.negativeButtonText == userActionDialogInfo.negativeButtonText && Intrinsics.e(this.data, userActionDialogInfo.data);
    }

    /* renamed from: a, reason: from getter */
    public final int getBody() {
        return this.body;
    }

    public final T b() {
        return this.data;
    }

    /* renamed from: c, reason: from getter */
    public final int getNegativeButtonText() {
        return this.negativeButtonText;
    }

    /* renamed from: d, reason: from getter */
    public final int getPositiveButtonText() {
        return this.positiveButtonText;
    }

    /* renamed from: e, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.body)) * 31) + Integer.hashCode(this.positiveButtonText)) * 31) + Integer.hashCode(this.negativeButtonText)) * 31;
        T t10 = this.data;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "UserActionDialogInfo(title=" + this.title + ", body=" + this.body + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", data=" + this.data + ')';
    }

    public UserActionDialogInfo(int i10, int i11, int i12, int i13, T t10) {
        this.title = i10;
        this.body = i11;
        this.positiveButtonText = i12;
        this.negativeButtonText = i13;
        this.data = t10;
    }
}
