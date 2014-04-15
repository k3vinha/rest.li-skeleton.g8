require "formula"

class Restli < Formula
  homepage "http://rest.li/"
  url "http://rest.li/releases/restli-tool/0.0.1/restli-0.0.1.tar.gz"
  sha1 "3cc00fa313a1034368558c96f917ebff0eb26f98"

  def install
    bin.install 'restli'
  end

  test do
    # `test do` will create, run in and delete a temporary directory.
    #
    # This test will fail and we won't accept that! It's enough to just replace
    # "false" with the main program this formula installs, but it'd be nice if you
    # were more thorough. Run the test with `brew test restli`.
    #
    # The installed folder is not in the path, so use the entire path to any
    # executables being tested: `system "#{bin}/program", "do", "something"`.
    system "#{bin}/restli"
  end
end