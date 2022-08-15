FROM ghcr.io/graalvm/graalvm-ce:22.2.0
RUN gu install ruby
WORKDIR /workdir
RUN echo 'puts "Hello from Ruby!\nVersion: #{RUBY_DESCRIPTION}"' > app.rb
CMD ruby app.rb