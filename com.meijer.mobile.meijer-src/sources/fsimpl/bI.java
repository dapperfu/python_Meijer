package fsimpl;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes15.dex */
public class bI extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f133014a;

    /* renamed from: b, reason: collision with root package name */
    private final bK f133015b;

    public bI(HttpURLConnection httpURLConnection, bK bKVar) {
        super(httpURLConnection.getURL());
        this.f133014a = httpURLConnection;
        this.f133015b = bKVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer a(String str, int i10) {
        return Integer.valueOf(this.f133014a.getHeaderFieldInt(str, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long a(String str, long j10) {
        return Long.valueOf(this.f133014a.getHeaderFieldLong(str, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a(Class[] clsArr) {
        return this.f133014a.getContent(clsArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(int i10) {
        return this.f133014a.getHeaderField(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(String str) {
        return this.f133014a.getHeaderField(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long b(String str, long j10) {
        return Long.valueOf(this.f133014a.getHeaderFieldDate(str, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b(int i10) {
        return this.f133014a.getHeaderFieldKey(i10);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f133014a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f133014a.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f133014a.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f133014a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f133014a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return bKVar.a(httpURLConnection, new bL() { // from class: fsimpl.bI$$ExternalSyntheticLambda6
            @Override // fsimpl.bL
            public final Object get() {
                return httpURLConnection.getContent();
            }
        });
    }

    @Override // java.net.URLConnection
    public Object getContent(final Class[] clsArr) {
        return this.f133015b.a(this.f133014a, new bL() { // from class: fsimpl.bI$$ExternalSyntheticLambda5
            @Override // fsimpl.bL
            public final Object get() {
                return this.f$0.a(clsArr);
            }
        });
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (String) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda14
            @Override // fsimpl.bM
            public final Object get() {
                return httpURLConnection.getContentEncoding();
            }
        });
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Integer) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda0
            @Override // fsimpl.bM
            public final Object get() {
                return Integer.valueOf(httpURLConnection.getContentLength());
            }
        })).intValue();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Long) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda7
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpURLConnection.getContentLengthLong());
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (String) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda15
            @Override // fsimpl.bM
            public final Object get() {
                return httpURLConnection.getContentType();
            }
        });
    }

    @Override // java.net.URLConnection
    public long getDate() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Long) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda13
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpURLConnection.getDate());
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f133014a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f133014a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f133014a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (InputStream) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda11
            @Override // fsimpl.bM
            public final Object get() {
                return httpURLConnection.getErrorStream();
            }
        });
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Long) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda2
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpURLConnection.getExpiration());
            }
        })).longValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(final int i10) {
        return (String) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda19
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(i10);
            }
        });
    }

    @Override // java.net.URLConnection
    public String getHeaderField(final String str) {
        return (String) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda1
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str);
            }
        });
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(final String str, final long j10) {
        return ((Long) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda12
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.b(str, j10);
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(final String str, final int i10) {
        return ((Integer) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda16
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str, i10);
            }
        })).intValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(final int i10) {
        return (String) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda18
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.b(i10);
            }
        });
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(final String str, final long j10) {
        return ((Long) this.f133015b.a(this.f133014a, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda3
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str, j10);
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (Map) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda8
            @Override // fsimpl.bM
            public final Object get() {
                return httpURLConnection.getHeaderFields();
            }
        });
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f133014a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (InputStream) bKVar.a(httpURLConnection, new bL() { // from class: fsimpl.bI$$ExternalSyntheticLambda10
            @Override // fsimpl.bL
            public final Object get() {
                return httpURLConnection.getInputStream();
            }
        });
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f133014a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Long) bKVar.a(httpURLConnection, new bM() { // from class: fsimpl.bI$$ExternalSyntheticLambda17
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpURLConnection.getLastModified());
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f133014a.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f133014a.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f133014a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f133014a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f133014a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f133014a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return ((Integer) bKVar.a(httpURLConnection, new bL() { // from class: fsimpl.bI$$ExternalSyntheticLambda4
            @Override // fsimpl.bL
            public final Object get() {
                return Integer.valueOf(httpURLConnection.getResponseCode());
            }
        })).intValue();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        bK bKVar = this.f133015b;
        final HttpURLConnection httpURLConnection = this.f133014a;
        httpURLConnection.getClass();
        return (String) bKVar.a(httpURLConnection, new bL() { // from class: fsimpl.bI$$ExternalSyntheticLambda9
            @Override // fsimpl.bL
            public final Object get() {
                return httpURLConnection.getResponseMessage();
            }
        });
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f133014a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f133014a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f133014a.setAllowUserInteraction(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f133014a.setChunkedStreamingMode(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f133014a.setConnectTimeout(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f133014a.setDefaultUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f133014a.setDoInput(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f133014a.setDoOutput(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f133014a.setFixedLengthStreamingMode(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f133014a.setFixedLengthStreamingMode(j10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f133014a.setIfModifiedSince(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f133014a.setInstanceFollowRedirects(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f133014a.setReadTimeout(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f133014a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f133014a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f133014a.setUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f133014a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f133014a.usingProxy();
    }
}
