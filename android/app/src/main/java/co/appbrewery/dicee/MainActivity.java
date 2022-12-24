package co.appbrewery.dicee;

import io.flutter.embedding.android.FlutterActivity

public class MainActivity extends FlutterActivity {
  @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
    GeneratePluginRegistrant.registerWith(flutterEngine);
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    GeneratedPluginRegistrant.registerWith(this);
  }
}
