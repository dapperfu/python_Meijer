package Gi;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"LGi/d;", "", "", "triggerDismissAction", "", "g", "(Z)V", "", "f", "()Ljava/lang/String;", "bodyLabel", "a", "actionLabel", "i", "()Z", "showCloseIcon", "LGi/e;", "getDuration", "()LGi/e;", "duration", "Lji/q1$m$a;", "h", "()Lji/q1$m$a;", "toastState", "Lkotlin/Function0;", "k", "()Lkotlin/jvm/functions/Function0;", "onLabelClicked", "j", "onCloseClicked", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface d {
    /* renamed from: a */
    String getActionLabel();

    /* renamed from: f */
    String getBodyLabel();

    void g(boolean triggerDismissAction);

    e getDuration();

    /* renamed from: h */
    q1.m.a getToastState();

    /* renamed from: i */
    boolean getShowCloseIcon();

    Function0<Boolean> j();

    Function0<Boolean> k();
}
