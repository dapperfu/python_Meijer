package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;
import x3.N;

/* loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* renamed from: c, reason: collision with root package name */
    public final Uri f57013c;

    /* renamed from: d, reason: collision with root package name */
    public final Ee.L<N> f57014d;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends N> list) {
        super(str, null, false, 1);
        this.f57013c = uri;
        this.f57014d = Ee.L.s(list);
    }
}
