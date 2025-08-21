package fsimpl;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes15.dex */
public class bJ extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final HttpsURLConnection f133016a;

    /* renamed from: b, reason: collision with root package name */
    private final bK f133017b;

    public bJ(HttpsURLConnection httpsURLConnection, bK bKVar) {
        super(httpsURLConnection.getURL());
        this.f133016a = httpsURLConnection;
        this.f133017b = bKVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer a(String str, int i10) {
        return Integer.valueOf(this.f133016a.getHeaderFieldInt(str, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long a(String str, long j10) {
        return Long.valueOf(this.f133016a.getHeaderFieldLong(str, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a(Class[] clsArr) {
        return this.f133016a.getContent(clsArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(int i10) {
        return this.f133016a.getHeaderField(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(String str) {
        return this.f133016a.getHeaderField(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long b(String str, long j10) {
        return Long.valueOf(this.f133016a.getHeaderFieldDate(str, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b(int i10) {
        return this.f133016a.getHeaderFieldKey(i10);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f133016a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f133016a.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f133016a.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f133016a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f133016a.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f133016a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return bKVar.a(httpsURLConnection, new bL() { // from class: fsimpl.bJ$$ExternalSyntheticLambda14
            @Override // fsimpl.bL
            public final Object get() {
                return httpsURLConnection.getContent();
            }
        });
    }

    @Override // java.net.URLConnection
    public Object getContent(final Class[] clsArr) {
        return this.f133017b.a(this.f133016a, new bL() { // from class: fsimpl.bJ$$ExternalSyntheticLambda9
            @Override // fsimpl.bL
            public final Object get() {
                return this.f$0.a(clsArr);
            }
        });
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (String) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda13
            @Override // fsimpl.bM
            public final Object get() {
                return httpsURLConnection.getContentEncoding();
            }
        });
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Integer) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda6
            @Override // fsimpl.bM
            public final Object get() {
                return Integer.valueOf(httpsURLConnection.getContentLength());
            }
        })).intValue();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Long) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda15
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpsURLConnection.getContentLengthLong());
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (String) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda18
            @Override // fsimpl.bM
            public final Object get() {
                return httpsURLConnection.getContentType();
            }
        });
    }

    @Override // java.net.URLConnection
    public long getDate() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Long) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda16
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpsURLConnection.getDate());
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f133016a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f133016a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f133016a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (InputStream) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda3
            @Override // fsimpl.bM
            public final Object get() {
                return httpsURLConnection.getErrorStream();
            }
        });
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Long) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda2
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpsURLConnection.getExpiration());
            }
        })).longValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(final int i10) {
        return (String) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda0
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(i10);
            }
        });
    }

    @Override // java.net.URLConnection
    public String getHeaderField(final String str) {
        return (String) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda19
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str);
            }
        });
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(final String str, final long j10) {
        return ((Long) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda7
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.b(str, j10);
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(final String str, final int i10) {
        return ((Integer) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda10
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str, i10);
            }
        })).intValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(final int i10) {
        return (String) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda12
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.b(i10);
            }
        });
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(final String str, final long j10) {
        return ((Long) this.f133017b.a(this.f133016a, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda11
            @Override // fsimpl.bM
            public final Object get() {
                return this.f$0.a(str, j10);
            }
        })).longValue();
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (Map) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda17
            @Override // fsimpl.bM
            public final Object get() {
                return httpsURLConnection.getHeaderFields();
            }
        });
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f133016a.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f133016a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (InputStream) bKVar.a(httpsURLConnection, new bL() { // from class: fsimpl.bJ$$ExternalSyntheticLambda8
            @Override // fsimpl.bL
            public final Object get() {
                return httpsURLConnection.getInputStream();
            }
        });
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f133016a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Long) bKVar.a(httpsURLConnection, new bM() { // from class: fsimpl.bJ$$ExternalSyntheticLambda1
            @Override // fsimpl.bM
            public final Object get() {
                return Long.valueOf(httpsURLConnection.getLastModified());
            }
        })).longValue();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f133016a.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f133016a.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f133016a.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f133016a.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f133016a.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f133016a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f133016a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f133016a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f133016a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return ((Integer) bKVar.a(httpsURLConnection, new bL() { // from class: fsimpl.bJ$$ExternalSyntheticLambda4
            @Override // fsimpl.bL
            public final Object get() {
                return Integer.valueOf(httpsURLConnection.getResponseCode());
            }
        })).intValue();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        bK bKVar = this.f133017b;
        final HttpsURLConnection httpsURLConnection = this.f133016a;
        httpsURLConnection.getClass();
        return (String) bKVar.a(httpsURLConnection, new bL() { // from class: fsimpl.bJ$$ExternalSyntheticLambda5
            @Override // fsimpl.bL
            public final Object get() {
                return httpsURLConnection.getResponseMessage();
            }
        });
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f133016a.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f133016a.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f133016a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f133016a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f133016a.setAllowUserInteraction(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f133016a.setChunkedStreamingMode(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f133016a.setConnectTimeout(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f133016a.setDefaultUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f133016a.setDoInput(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f133016a.setDoOutput(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f133016a.setFixedLengthStreamingMode(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f133016a.setFixedLengthStreamingMode(j10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f133016a.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f133016a.setIfModifiedSince(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f133016a.setInstanceFollowRedirects(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f133016a.setReadTimeout(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f133016a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f133016a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f133016a.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f133016a.setUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f133016a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f133016a.usingProxy();
    }
}
