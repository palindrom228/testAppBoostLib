
Pod::Spec.new do |s|
  s.name         = "RNUssdDial"
  s.version      = "1.0.0"
  s.summary      = "RNUssdDial"
  s.description  = <<-DESC
                  RNUssdDial
                   DESC
  s.homepage     = "Some Home Page"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNUssdDial.git", :tag => "master" }
  s.source_files  = "ios/**/*.{h,m,swift}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  