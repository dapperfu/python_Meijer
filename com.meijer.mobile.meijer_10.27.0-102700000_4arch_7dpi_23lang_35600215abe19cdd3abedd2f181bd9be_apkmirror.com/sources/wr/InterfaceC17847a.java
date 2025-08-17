package wr;

import ej.EntryChange;
import ej.ShoppingCart;
import kotlin.Metadata;
import tk.AbstractC17116a;
import ur.AbstractC17302a;
import vr.AbstractC17604a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H&¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lwr/a;", "", "Ltk/c;", "Lej/C;", "cartResource", "", "observeCart", "(Ltk/c;)V", "LNu/a;", "getDisposable", "()LNu/a;", "Lur/a;", "processedRequest", "Lej/j;", "entryChange", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC17847a {
    /* renamed from: getDisposable */
    Nu.a getDisposables();

    void observeCart(tk.c<ShoppingCart> cartResource);

    void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange);

    <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge);
}
